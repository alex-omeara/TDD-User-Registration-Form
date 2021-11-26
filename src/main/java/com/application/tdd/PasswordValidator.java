package com.application.tdd;

import java.util.regex.Pattern;

public class PasswordValidator {
    public boolean checkLength(String password) {
        return password.length() >= 7;
    }

    public boolean hasLetter(String password) {
        return Pattern.matches("[a-zA-Z]+", password);
    }

    public boolean hasSpecialChar() {
        return false;
    }
}
