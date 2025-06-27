package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UserManagerTest {

    @Test
    public void testSendNotificationWithCorrectArguments() {
        // Step 1: Create mock
        NotificationService mockService = mock(NotificationService.class);

        // Step 2: Inject into UserManager
        UserManager manager = new UserManager(mockService);

        // Step 3: Call method
        manager.registerUser("xyz@example.com");

        // Step 4: Verify with exact match
        verify(mockService).send(eq("xyz@example.com"), eq("Welcome!"));

        // Optionally: allow any message for the same email
        // verify(mockService).send(eq("xyz@example.com"), anyString());
    }
}
