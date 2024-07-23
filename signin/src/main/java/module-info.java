module sample.signin {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens sample.signin to javafx.fxml;
    exports sample.signin;
}