module com.company.frameworkapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.company.frameworkapplication to javafx.fxml;
    exports com.company.frameworkapplication;
}