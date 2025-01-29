package cz.spsmb.sec.cv24.cv_24;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label lbl_vysledek;

    @FXML
    private TextField tf_cislo1;
    @FXML
    private TextField tf_cislo2;

    @FXML
    protected void onSumClick() {
        Integer cislo1 = Integer.parseInt(tf_cislo1.getText());
        Integer cislo2 = Integer.parseInt(tf_cislo2.getText());
        lbl_vysledek.setText(String.valueOf(cislo1 + cislo2));
    }

    @FXML
    protected void onMultiplyClick() {
        Integer cislo1 = Integer.parseInt(tf_cislo1.getText());
        Integer cislo2 = Integer.parseInt(tf_cislo2.getText());
        lbl_vysledek.setText(String.valueOf(cislo1 * cislo2));
    }
}