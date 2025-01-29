module cz.spsmb.sec.cv24.cv_24 {
    requires javafx.controls;
    requires javafx.fxml;


    opens cz.spsmb.sec.cv24.cv_24 to javafx.fxml;
    exports cz.spsmb.sec.cv24.cv_24;
}