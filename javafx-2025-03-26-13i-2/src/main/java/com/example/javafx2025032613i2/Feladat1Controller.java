package com.example.javafx2025032613i2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Feladat1Controller implements Initializable {
    @FXML
    private ListView<String> kerulet;
    private Connection conn = DatabaseConnection.getConnection();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Statement stmt = null;
        ObservableList<String> lista = FXCollections.observableArrayList();

        try{
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nev, lakossag FROM keruletek ORDER BY lakossag DESC");
            while (rs.next()){
                String er = rs.getString("nev") + " ("+rs.getInt("lakossag")+")";
                lista.add(er);
            }
            kerulet.setItems(lista);
            rs.close();
        }catch(SQLException sqle){
            System.out.println(sqle);
        }
    }
}
