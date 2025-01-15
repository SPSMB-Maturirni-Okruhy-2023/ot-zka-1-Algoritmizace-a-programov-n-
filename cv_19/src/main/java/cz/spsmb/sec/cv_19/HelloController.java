package cz.spsmb.sec.cv_19;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label outKey;

    @FXML
    private TextField inputText;

    @FXML
    protected void onKePressed() {
        String text = inputText.getText();
        outKey.setText(text);
        inputText.setText("");

    }
}