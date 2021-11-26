package com.application.tdd;

public class InputValidator {
    public boolean hasAt(String input) {
        return input.contains("@");
    }

    public boolean validPrefix(String input) {
        String[] emailParts = input.split("@");
        String domain = emailParts[0];
        return !domain.isEmpty();
    }

    public boolean validDomain() {
        return false;
    }
}
