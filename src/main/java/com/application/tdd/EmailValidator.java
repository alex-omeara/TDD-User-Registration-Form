package com.application.tdd;

import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean validateEmail(String email) {
        return hasAt(email) && validPrefix(email) && validDomain(email);
    }

    public static boolean hasAt(String input) {
        return input.contains("@");
    }

    public static boolean validPrefix(String input) {
        String[] emailParts = input.split("@");
        String prefix = emailParts[0];
        return !prefix.isEmpty();
    }

    public static boolean validDomain(String input) {
        String regex = ".*@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
        return Pattern.matches(regex, input);
    }
}
