package com.application.tdd;

public class InputValidator {
    public boolean validateInput(String input) {
        boolean isValid = false;
        if (input.isEmpty()) {
            isValid = true;
        } else if (input.contains("@")) {
            isValid = true;
        }
        return isValid;
    }
}
