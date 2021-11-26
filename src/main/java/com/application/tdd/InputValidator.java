package com.application.tdd;

public class InputValidator {
    public boolean hasAt(String input) {
        return input.contains("@");
    }

    public boolean validPrefix(String prefix) {
        return false;
    }
}
