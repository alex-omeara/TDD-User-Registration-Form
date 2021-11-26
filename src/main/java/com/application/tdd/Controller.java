package com.application.tdd;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField emailInput;

    @FXML
    private PasswordField passwordInput;

    @FXML
    private Label statusMessage;

    @FXML
    protected void onSubmitButtonClick() {
        EmailValidator emailValidator = new EmailValidator();
        boolean validEmail = emailValidator.validate(emailInput.getText());
        PasswordValidator passwordValidator = new PasswordValidator();
        boolean validPassword = passwordValidator.validate(passwordInput.getText());
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