package com.gateways.payment;

import com.gateways.request.TransactionRequest;
import com.gateways.transaction.TransactionStrategy;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.gateways.payment.PaymentUtils.resolvePaymentStrategy;

@Service
@Transactional
@RequiredArgsConstructor
public class PaymentService {

    public String pay(TransactionRequest transactionRequest){

        String gateway = transactionRequest.getGateway();
        String method = transactionRequest.getMethod();

        PaymentStrategy paymentStrategy = resolvePaymentStrategy(gateway);

        TransactionStrategy transactionStrategy = paymentStrategy.getTransactionStrategy(method);

        boolean transactionWasSuccessful = transactionStrategy
                .processTransaction(transactionRequest);

        if(transactionWasSuccessful){

            return "Payment successful";
        }
        else{

            return "Payment failed";
        }
    }
}