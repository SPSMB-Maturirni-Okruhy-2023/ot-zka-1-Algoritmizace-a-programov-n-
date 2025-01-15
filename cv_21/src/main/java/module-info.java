module com.example.cv_21 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cv_21 to javafx.fxml;
    exports com.example.cv_21;
}