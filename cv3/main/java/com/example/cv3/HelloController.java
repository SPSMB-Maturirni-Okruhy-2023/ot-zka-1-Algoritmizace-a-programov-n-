package com.example.cv3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    private TextField age;

    @FXML
    private TextField name;

    @FXML
    protected void onButtonClick() {
        System.out.println(name.getText());
        label.setText("Miluju " + name.getText() + " " + age.getText() + " let");
    }
}