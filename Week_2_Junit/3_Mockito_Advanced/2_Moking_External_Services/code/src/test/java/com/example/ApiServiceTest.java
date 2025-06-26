package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApiServiceTest {

    @Test
    public void testServiceWithMockRestClient() {
        // Step 1: Create mock REST client
        RestClient mockRestClient = mock(RestClient.class);

        // Step 2: Stub method to return mock response
        when(mockRestClient.getResponse()).thenReturn("Mock Response");

        // Step 3: Inject mock into service
        ApiService apiService = new ApiService(mockRestClient);

        // Step 4: Assert service output
        String result = apiService.fetchData();
        assertEquals("Fetched Mock Response", result);

        // Step 5: Verify interaction
        verify(mockRestClient).getResponse();
    }
}
