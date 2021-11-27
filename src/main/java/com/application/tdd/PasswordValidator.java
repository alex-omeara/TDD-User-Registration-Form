package com.application.tdd;

import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean validatePassword(String password) {
        return checkLength(password) && hasDigit(password) && hasLetter(password) && hasSpecialChar(password);
    }

    public static boolean checkLength(String password) {
        return password.length() >= 7;
    }

    public static boolean hasLetter(String password) {
        return Pattern.matches("^.*[a-zA-Z]+.*$", password);
    }

    public static boolean hasSpecialChar(String password) {
        return Pattern.matches("^.*[*^&@!]+.*$", password);
    }

    public static boolean hasDigit(String password) {
        return Pattern.matches("^.*[0-9]+.*$", password);
    }
}
