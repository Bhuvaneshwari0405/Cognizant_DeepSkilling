package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Optional: Stub return value
        when(mockApi.getData()).thenReturn("Mocked Response");

        // Step 2: Inject into service
        MyService service = new MyService(mockApi);

        // Step 3: Call the method
        String result = service.fetchData();

        // Step 4: Verify interaction
        verify(mockApi).getData(); // ✅ Check that getData() was called once

        // Optional: Verify output correctness
        assertEquals("Mocked Response", result);
    }
}
