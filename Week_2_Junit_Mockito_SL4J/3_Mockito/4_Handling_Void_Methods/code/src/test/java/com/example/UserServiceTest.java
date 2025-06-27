package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testVoidMethodLogCalled() {
        // Step 1: Create mock
        Logger mockLogger = mock(Logger.class);

        // Step 2: Stub void method (optional since default is doNothing())
        doNothing().when(mockLogger).log(anyString());

        // Step 3: Inject and test
        UserService service = new UserService(mockLogger);
        service.performAction();

        // Step 4: Verify interaction
        verify(mockLogger).log("User action performed");
    }
}
