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
        statusMessage.setText("Hello World");
    }
}