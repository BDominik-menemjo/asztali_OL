package com.example.javafx2025040213i2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
public class HelloController {
    @FXML
    private BorderPane bp;

    private void loadFXMLtoCenter(String filename) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(filename));
            Node content = loader.load();
            bp.setCenter(content);
        } catch (IOException ioe) {
            System.err.println("Hiba a(z) " + filename + " betöltésekor!");
        }
    }

    public void noiMunkatarsak() {
        loadFXMLtoCenter("noiMunkatarsak.fxml");
    }

    public void szures() {
        loadFXMLtoCenter("szures.fxml");
    }

    public void kezeles(){
        loadFXMLtoCenter("alkalmazottak-kezelese.fxml");
    }

}