module com.example.cv_20 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cv_20 to javafx.fxml;
    exports com.example.cv_20;
}