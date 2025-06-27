package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    void testPerformTaskCompletesInTime() {
        PerformanceTester tester = new PerformanceTester();

        assertTimeout(Duration.ofMillis(1000), () -> {
            tester.performTask();
        }, "Method should complete within 1 second");
    }

    @Test
    void testFailsIfTaskTakesTooLong() {
        PerformanceTester tester = new PerformanceTester();

        assertTimeout(Duration.ofMillis(100), () -> {
            tester.performTask();
        }, "Should fail if task takes more than 100ms");
    }
}
