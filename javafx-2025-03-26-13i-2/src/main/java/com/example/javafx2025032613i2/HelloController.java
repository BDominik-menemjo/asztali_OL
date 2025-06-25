package com.example.javafx2025032613i2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class HelloController {
    @FXML
    private BorderPane bp;

    private void loadFXMLtoRight(String filename) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(filename));
            Node content = loader.load();
            bp.setRight(content);
        } catch (IOException ioe) {
            System.err.println("Hiba a(z) " + filename + " betöltésekor!");
        }
    }

    public void keruletekLakossagszamSzerint() {
        loadFXMLtoRight("feladat1-view.fxml");
    }

    public void budaiOldalKeruletei() {
        loadFXMLtoRight("feladat2-view.fxml");
    }
}