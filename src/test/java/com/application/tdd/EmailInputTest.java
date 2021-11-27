package com.application.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.application.tdd.EmailValidator.*;

public class EmailInputTest {

    @Test
    public void testEmailNotEmpty() {
        Assertions.assertFalse(hasAt(""));
    }

    @Test
    public void testEmailHasAtSymbol() {
        Assertions.assertTrue(hasAt("@"));
    }

    @Test
    public void testEmailHasPrefix() {
        Assertions.assertTrue(validPrefix("hello@"));
    }

    @Test
    public void testEmailHasDomain() {
        Assertions.assertTrue(validDomain("@1he.1ie"));
    }

    @Test
    public void testInvalidEmailRejected() {
        Assertions.assertFalse(validateEmail("@hey"));
        Assertions.assertFalse(validateEmail("woahhye.e"));
        Assertions.assertFalse(validateEmail("jesus@"));
    }
}
