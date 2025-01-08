package cz.spsmb.secdavid.cv_18;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label result;

    @FXML
    private TextField decNumber;

    @FXML
    protected void convertToBin() {
        String number = decNumber.getText();
        try {
            String binary = Integer.toBinaryString(Integer.parseInt(number));
            result.setText(binary);

        }
        catch (NumberFormatException e){
            result.setText("Zadaný text není číslo!");
        }
    }
}