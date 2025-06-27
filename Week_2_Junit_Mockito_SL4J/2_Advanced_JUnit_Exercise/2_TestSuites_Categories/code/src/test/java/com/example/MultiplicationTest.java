package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTest {

    MathUtils math = new MathUtils();

    @Test
    void testMultiply() {
        assertEquals(12, math.multiply(3, 4));
    }
}
