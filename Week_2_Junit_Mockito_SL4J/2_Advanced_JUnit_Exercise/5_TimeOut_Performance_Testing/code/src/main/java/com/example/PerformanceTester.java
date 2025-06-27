package com.example;

public class PerformanceTester {

    public void performTask() {
        // Simulate a task that takes time (e.g., 500ms)
        try {
            Thread.sleep(500); // Simulates time-consuming work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupted state
        }
    }
}
