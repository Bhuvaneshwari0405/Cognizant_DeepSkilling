package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.anyString;

public class FileManagerTest {

    @Test
    public void testVoidMethodThrowsException() throws Exception {
        // Step 1: Create mock
        FileService mockService = mock(FileService.class);

        // Step 2: Stub the void method to throw an exception
        doThrow(new RuntimeException("File not found"))
                .when(mockService)
                .deleteFile(anyString());

        // Step 3: Inject and call method
        FileManager manager = new FileManager(mockService);

        // Step 4: Assert exception is thrown
        assertThrows(RuntimeException.class, () -> manager.delete("abc.txt"));

        // Step 5: Verify interaction
        verify(mockService).deleteFile("abc.txt");
    }
}
