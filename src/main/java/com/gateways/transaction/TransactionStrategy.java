package com.gateways.transaction;

import com.gateways.request.TransactionRequest;

public interface TransactionStrategy {
    boolean processTransaction(TransactionRequest transactionRequest);
}