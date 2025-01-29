module com.example.cv23 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cv23 to javafx.fxml;
    exports com.example.cv23;
}