package com.gateways.tokenization;

import java.util.Map;

public interface TokenizationStrategy {
    String tokenize(Map<String, Object> paymentData);
}