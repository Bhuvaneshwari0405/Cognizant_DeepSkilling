package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(3)
    void testC() {
        System.out.println("Running testC (Order 3)");
        assertTrue(3 < 5);
    }

    @Test
    @Order(1)
    void testA() {
        System.out.println("Running testA (Order 1)");
        assertEquals("Hello", "Hello");
    }

    @Test
    @Order(2)
    void testB() {
        System.out.println("Running testB (Order 2)");
        assertNotNull(new Object());
    }
}
