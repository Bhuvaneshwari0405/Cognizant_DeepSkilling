package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    MathUtils math = new MathUtils();

    @Test
    void testAdd() {
        assertEquals(7, math.add(3, 4));
    }
}
