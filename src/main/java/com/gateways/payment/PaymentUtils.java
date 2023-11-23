package com.gateways.payment;

import org.springframework.stereotype.Component;

@Component
public class PaymentUtils {

    public static PaymentStrategy resolvePaymentStrategy(String gateway) {

        if ("WOMPI".equalsIgnoreCase(gateway)) {

            return new WompiPaymentStrategy();

        } else if ("STRAPI".equalsIgnoreCase(gateway)) {

            return new StrapiPaymentStrategy();

        } else if ("PAYPAL".equals(gateway)){

            return new PaypalPaymetStrategy();
        }
        else{

            throw new IllegalArgumentException("Unknown payment gateway: " + gateway);
        }
    }
}