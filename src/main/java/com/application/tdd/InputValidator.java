package com.application.tdd;

import java.util.regex.Pattern;

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
        String regex = "[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
        String[] emailParts = input.split("@");
        return Pattern.matches(regex, emailParts[1]);
    }
}
