package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    @Test
    void testThrowsExceptionForNullInput() {
        ExceptionThrower et = new ExceptionThrower();

        assertThrows(IllegalArgumentException.class, () -> {
            et.throwException(null);
        });
    }

    @Test
    void testThrowsExceptionForEmptyInput() {
        ExceptionThrower et = new ExceptionThrower();

        assertThrows(IllegalArgumentException.class, () -> {
            et.throwException("");
        });
    }

    @Test
    void testNoExceptionForValidInput() {
        ExceptionThrower et = new ExceptionThrower();

        assertDoesNotThrow(() -> {
            et.throwException("Hello JUnit");
        });
    }
}
