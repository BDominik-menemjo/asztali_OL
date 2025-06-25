package com.example.javafx2025040213i2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManagement {
    private static Connection conn = DatabaseConnection.getConnection();

    public static void setMunkahely(ComboBox<String> lenyiloLista) throws SQLException {
        Statement stmt = null;
        ObservableList<String> munkahelyek = FXCollections.observableArrayList();
        munkahelyek.add("Munkahelyek...");
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT munkahely FROM munkahely");
        while (rs.next()) {
            munkahelyek.add(rs.getString("munkahely"));
        }
        lenyiloLista.setItems(munkahelyek);
        lenyiloLista.getSelectionModel().select(0);
        rs.close();
    }

    public static void setVegzettseg(ComboBox<String> lenyiloLista) throws SQLException {
        Statement stmt = null;
        ObservableList<String> vegzettsegek = FXCollections.observableArrayList();
        vegzettsegek.add("Vegzettség...");
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT vegzettseg FROM vegzettseg");
        while (rs.next()) {
            vegzettsegek.add(rs.getString("vegzettseg"));
        }
        lenyiloLista.setItems(vegzettsegek);
        lenyiloLista.getSelectionModel().select(0);
        rs.close();
    }

    public static void setNem(ComboBox<String> lenyiloLista){
        ObservableList<String> nemek = FXCollections.observableArrayList();
        nemek.add("Neme...");
        nemek.add("Férfi");
        nemek.add("Nő");
        lenyiloLista.setItems(nemek);
        lenyiloLista.getSelectionModel().select(0);
    }
}
