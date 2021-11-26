module com.application.tdd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.application.tdd to javafx.fxml;
    exports com.application.tdd;
}