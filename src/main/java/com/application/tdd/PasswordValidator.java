package com.application.tdd;

import java.util.regex.Pattern;

public class PasswordValidator {
    public boolean validatePassword() {
        return false;
    }

    public boolean checkLength(String password) {
        return password.length() >= 7;
    }

    public boolean hasLetter(String password) {
        return Pattern.matches(".*[a-zA-Z]+.*", password);
    }

    public boolean hasSpecialChar(String password) {
        return Pattern.matches(".*[*^&@!]+.*", password);
    }

    public boolean hasDigit(String password) {
        return Pattern.matches(".*[0-9]+.*", password);
    }
}
