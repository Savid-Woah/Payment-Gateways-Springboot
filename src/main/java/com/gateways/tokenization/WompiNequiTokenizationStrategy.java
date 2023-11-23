package com.gateways.tokenization;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@RequiredArgsConstructor
@Component("WompiNequiTokenizationStrategy")
public class WompiNequiTokenizationStrategy implements TokenizationStrategy {
    @Override
    public String tokenize(Map<String, Object> paymentData) {
        return null;
    }
}