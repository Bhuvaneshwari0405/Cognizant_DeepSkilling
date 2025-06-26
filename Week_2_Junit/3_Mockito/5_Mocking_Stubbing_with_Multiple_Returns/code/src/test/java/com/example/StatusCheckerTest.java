package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class StatusCheckerTest {

    @Test
    public void testMultipleReturnValues() {
        // Step 1: Create mock
        StatusApi mockApi = mock(StatusApi.class);

        // Step 2: Stub getStatus() to return different values
        when(mockApi.getStatus())
            .thenReturn("Pending")
            .thenReturn("Completed");

        // Step 3: Inject into service and call method
        StatusChecker checker = new StatusChecker(mockApi);
        String result = checker.checkStatusTwice();

        // Step 4: Assert result
        assertEquals("Pending -> Completed", result);

        // Optional: Verify getStatus() was called twice
        verify(mockApi, times(2)).getStatus();
    }
}
