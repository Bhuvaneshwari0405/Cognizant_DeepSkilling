package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    @Test
    public void testServiceWithMockRepository() {
        // Step 1: Create mock repository
        Repository mockRepository = mock(Repository.class);

        // Step 2: Stub method
        when(mockRepository.getData()).thenReturn("Mock Data");

        // Step 3: Inject into service and call method
        Service service = new Service(mockRepository);
        String result = service.processData();

        // Step 4: Assert result
        assertEquals("Processed Mock Data", result);

        // Optional: Verify interaction
        verify(mockRepository).getData();
    }
}
