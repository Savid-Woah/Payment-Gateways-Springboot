package com.gateways.payment;

import com.gateways.request.TransactionRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@ResponseBody
@RequiredArgsConstructor
@RequestMapping("gateways/v1/api/payments/")
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public String pay(@Validated @RequestBody TransactionRequest transactionRequest){
        return paymentService.pay(transactionRequest);
    }
}