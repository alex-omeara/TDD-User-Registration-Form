package com.application.tdd;

public class PasswordValidator {
    public boolean checkLength(String password) {
        return password.length() >= 7;
    }
}
