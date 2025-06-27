package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String user = "Alice";
        int age = 28;
        String status = "active";

        logger.info("User {} is {} years old and is currently {}", user, age, status);

        int orderId = 1023;
        double amount = 249.75;
        logger.debug("Order with ID {} has a total of ${}", orderId, amount);
    }
}
