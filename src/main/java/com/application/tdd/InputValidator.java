package com.application.tdd;

public class InputValidator {
    public boolean hasAt(String input) {
        return input.contains("@");
    }

    public boolean validPrefix(String input) {
        String[] emailParts = input.split("@");
        String prefix = emailParts[0];
        return !prefix.isEmpty();
    }

    public boolean validDomain(String input) {
        String[] emailParts = input.split("@");
        String domain = emailParts[0];
        return !domain.isEmpty();
    }
}
