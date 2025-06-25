package com.example.java20241111;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private BorderPane bp;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void showVeradokKereses(){
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("veradok-kereses.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        bp.setCenter(root);
    }

    public void showVeradokRegisztracio(){
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("veradok-regisztracio.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        bp.setCenter(root);
    }
}