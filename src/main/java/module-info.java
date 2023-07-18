module com.example.cmscproj4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cmscproj4 to javafx.fxml;
    exports com.example.cmscproj4;
}