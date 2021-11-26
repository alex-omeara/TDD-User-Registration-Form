package com.application.tdd;

import java.util.regex.Pattern;

public class PasswordValidator {
    public boolean validate(String password) {
        return checkLength(password) && hasDigit(password) && hasLetter(password) && hasSpecialChar(password);
    }

    public boolean checkLength(String password) {
        return password.length() >= 7;
    }

    public boolean hasLetter(String password) {
        return Pattern.matches("^.*[a-zA-Z]+.*$", password);
    }

    public boolean hasSpecialChar(String password) {
        return Pattern.matches("^.*[*^&@!]+.*$", password);
    }

    public boolean hasDigit(String password) {
        return Pattern.matches("^.*[0-9]+.*$", password);
    }
}
