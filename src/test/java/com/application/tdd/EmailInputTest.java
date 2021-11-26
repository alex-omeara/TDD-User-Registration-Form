package com.application.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailInputTest {
    InputValidator validator;

    @BeforeEach
    public void setUp() {
        validator = new InputValidator();
    }

    @Test
    public void testInputNotEmpty() {
        Assertions.assertTrue(validator.validateInput(""));
    }

    @Test
    public void testInputHasAtSymbol() {
        Assertions.assertTrue(validator.validateInput("@"));
    }
}
