module com.example.javafx2025040213i2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.javafx2025040213i2 to javafx.fxml;
    exports com.example.javafx2025040213i2;
}