package com.application.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasswordInputTest {
    PasswordValidator passwordValidator;

    @BeforeEach
    public void setUp() {
        passwordValidator = new PasswordValidator();
    }

    @Test
    public void testPasswordAtLeastSevenCharacters() {
        Assertions.assertTrue(passwordValidator.checkLength("password"));
    }

    @Test
    public void testPasswordHasOneLetter() {
        Assertions.assertTrue(passwordValidator.hasLetter("password"));
    }

    @Test
    public void testPasswordHasSpecialChar() {
        Assertions.assertTrue(passwordValidator.hasSpecialChar("he@y"));
    }

    @Test
    public void testPasswordHasOneDigit() {
        Assertions.assertTrue(passwordValidator.hasDigit("he1e"));
    }
}
