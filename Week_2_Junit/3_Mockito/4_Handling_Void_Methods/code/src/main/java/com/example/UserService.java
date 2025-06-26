package com.example;

public class UserService {
    private final Logger logger;

    public UserService(Logger logger) {
        this.logger = logger;
    }

    public void performAction() {
        // Business logic...
        logger.log("User action performed");
    }
}
