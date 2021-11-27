package com.application.tdd;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import static com.application.tdd.EmailValidator.validateEmail;
import static com.application.tdd.PasswordValidator.validatePassword;

public class Controller {
    @FXML
    private TextField emailInput;

    @FXML
    private PasswordField passwordInput;

    @FXML
    private Label statusMessage;

    @FXML
    protected void onSubmitButtonClick() {
        boolean validEmail = validateEmail(emailInput.getText());
        boolean validPassword = validatePassword(passwordInput.getText());
        String outputMessage = "";
        if (!validEmail) {
            outputMessage += "Invalid Email";
            if (!validPassword) {
                outputMessage += "\nInvalid Password";
            }
        } else if (!validPassword) {
            outputMessage = "Invalid Password";
        } else {
            outputMessage = "Success";
        }
        statusMessage.setText(outputMessage);
    }
}