package com.example.javafx2025032613i2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class Feladat2Controller implements Initializable {
    @FXML
    private TableView tablazat;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tablazat.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
    }
}
