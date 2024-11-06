module com.example.cv3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cv3 to javafx.fxml;
    exports com.example.cv3;
}