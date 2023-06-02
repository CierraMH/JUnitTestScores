package org.example;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Test TestScores class")
class TestScoresTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }
    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }

    @Test
    @DisplayName("Test testScores() method")
    void testScores() {
        assertEquals("Your grade is an F", TestScores.testScores(54));
        assertEquals("Your grade is an D", TestScores.testScores(61));
        assertEquals("Your grade is an C", TestScores.testScores(77));
        assertEquals("Your grade is an B", TestScores.testScores(85));
        assertEquals("Your grade is an A", TestScores.testScores(98));
    }
}