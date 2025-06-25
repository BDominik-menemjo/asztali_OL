package com.example.javafx2025040213i2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SzuresController implements Initializable {
    @FXML
    private ComboBox<String> munkahely, vegzettseg;
    @FXML
    private ListView<String> talalatok;

    private Connection conn = DatabaseConnection.getConnection();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            DatabaseManagement.setMunkahely(munkahely);
            DatabaseManagement.setVegzettseg(vegzettseg);
        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Adatbázis hiba");
            alert.setContentText("Hiba oka: " + e);
            alert.show();
        }
    }

    public void szures() {
        int munkahelyIndex = munkahely.getSelectionModel().getSelectedIndex();
        int vegzettsegIndex = vegzettseg.getSelectionModel().getSelectedIndex();

        if (munkahelyIndex == 0 && vegzettsegIndex == 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiányzó adatok!");
            alert.setContentText("Legalább az egyik szűrési feltételt adja meg!");
            alert.show();
        } else {
            List<String> parameterek = new ArrayList<>();

            String sql = "SELECT nev FROM " +
                    "alkalmazott, munkahely, vegzettseg WHERE " +
                    "alkalmazott.munkahely_id=munkahely.id AND alkalmazott.vegzettseg_id=vegzettseg.id";
            if (munkahelyIndex > 0) {
                sql += " AND munkahely.munkahely = ?";
                parameterek.add(munkahely.getSelectionModel().getSelectedItem());
            }
            if (vegzettsegIndex > 0) {
                sql += " AND vegzettseg.vegzettseg = ?";
                parameterek.add(vegzettseg.getSelectionModel().getSelectedItem());
            }
            PreparedStatement pstmt = null;
            try {
                pstmt = conn.prepareStatement(sql);
                for (int i = 0; i < parameterek.size(); i++) {
                    pstmt.setString(i + 1, parameterek.get(i));
                }
                ResultSet rs = pstmt.executeQuery();
                ObservableList<String> er = FXCollections.observableArrayList();
                while (rs.next()) {
                    er.add(rs.getString("alkalmazott.nev"));
                }
                talalatok.setItems(er);
                rs.close();
            } catch (SQLException sqle) {
                System.out.println(sqle);
            }
        }
    }
}
