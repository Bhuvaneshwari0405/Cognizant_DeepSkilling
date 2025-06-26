package com.example;

public class StatusChecker {
    private final StatusApi statusApi;

    public StatusChecker(StatusApi statusApi) {
        this.statusApi = statusApi;
    }

    public String checkStatusTwice() {
        String first = statusApi.getStatus();
        String second = statusApi.getStatus();
        return first + " -> " + second;
    }
}
