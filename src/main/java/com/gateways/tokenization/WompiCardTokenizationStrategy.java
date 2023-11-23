package com.gateways.tokenization;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@RequiredArgsConstructor
@Component("WompiCardTokenizationStrategy")
public class WompiCardTokenizationStrategy implements TokenizationStrategy {
    @Override
    public String tokenize(Map<String, Object> paymentData) {
        return null;
    }
}