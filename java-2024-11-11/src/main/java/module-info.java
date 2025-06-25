module com.example.java20241111 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.java20241111 to javafx.fxml;
    exports com.example.java20241111;
}