package com.application.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.application.tdd.PasswordValidator.*;

public class PasswordInputTest {

    @Test
    public void testPasswordAtLeastSevenCharacters() {
        Assertions.assertTrue(checkLength("password"));
    }

    @Test
    public void testPasswordHasOneLetter() {
        Assertions.assertTrue(hasLetter("password"));
    }

    @Test
    public void testPasswordHasSpecialChar() {
        Assertions.assertTrue(hasSpecialChar("he@y"));
    }

    @Test
    public void testPasswordHasOneDigit() {
        Assertions.assertTrue(hasDigit("he1e"));
    }

    @Test
    public void testInvalidPasswordRejected() {
        Assertions.assertFalse(validatePassword("under7"));
        Assertions.assertFalse(validatePassword("12345abcde"));
        Assertions.assertFalse(validatePassword("12345456!^&"));
        Assertions.assertFalse(validatePassword("bob&&&&"));
    }
}
