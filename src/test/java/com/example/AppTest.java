package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAddition() {
        assertEquals(30, App.add(10, 20));
    }

    @Test
    void testAdditionWithZero() {
        assertEquals(10, App.add(10, 0));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-5, App.add(-10, 5));
    }
}
