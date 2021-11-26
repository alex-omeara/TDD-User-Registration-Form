package com.application.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailInputTest {
    EmailValidator emailValidator;

    @BeforeEach
    public void setUp() {
        emailValidator = new EmailValidator();
    }

    @Test
    public void testInputNotEmpty() {
        Assertions.assertFalse(emailValidator.hasAt(""));
    }

    @Test
    public void testInputHasAtSymbol() {
        Assertions.assertTrue(emailValidator.hasAt("@"));
    }

    @Test
    public void testInputHasPrefix() {
        Assertions.assertTrue(emailValidator.validPrefix("hello@"));
    }

    @Test
    public void testInputHasDomain() {
        Assertions.assertTrue(emailValidator.validDomain("hello@1he.1ie"));
    }
}
