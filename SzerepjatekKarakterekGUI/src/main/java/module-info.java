module org.example.szerepjatekkarakterekgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.sql;

    opens org.example.szerepjatekkarakterekgui to javafx.fxml;
    exports org.example.szerepjatekkarakterekgui;
}