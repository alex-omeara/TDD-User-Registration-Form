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
    public void testEmailNotEmpty() {
        Assertions.assertFalse(emailValidator.hasAt(""));
    }

    @Test
    public void testEmailHasAtSymbol() {
        Assertions.assertTrue(emailValidator.hasAt("@"));
    }

    @Test
    public void testEmailHasPrefix() {
        Assertions.assertTrue(emailValidator.validPrefix("hello@"));
    }

    @Test
    public void testEmailHasDomain() {
        Assertions.assertTrue(emailValidator.validDomain("@1he.1ie"));
    }

    @Test
    public void testInvalidEmailRejected() {
        Assertions.assertFalse(emailValidator.validate("@hey"));
        Assertions.assertFalse(emailValidator.validate("woahhye.e"));
        Assertions.assertFalse(emailValidator.validate("jesus@"));
    }
}
