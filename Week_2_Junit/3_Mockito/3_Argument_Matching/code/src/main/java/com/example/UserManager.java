package com.example;

public class UserManager {
    private final NotificationService notificationService;

    public UserManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String email) {
        // Business logic for registering a user...
        notificationService.send(email, "Welcome!");
    }
}
