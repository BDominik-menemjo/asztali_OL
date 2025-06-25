package com.example.javafx2025040213i2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class AlkalmazottakKezeleseController implements Initializable {
    @FXML
    private ComboBox<String> munkahely, vegzettseg, nem;
    @FXML
    private TextField nev;
    @FXML
    private ListView<String> lista;

    private Connection conn = DatabaseConnection.getConnection();

    private void dolgozokBetoltese(){
        Statement stmt=null;
        ObservableList<String> eredmenyLista= FXCollections.observableArrayList();

        try{
            stmt=conn.createStatement();
            ResultSet lekerdezettAlkalmazottak=stmt.executeQuery("SELECT nev FROM alkalmazott");

            while(lekerdezettAlkalmazottak.next()){
                String er=lekerdezettAlkalmazottak.getString("nev");
                eredmenyLista.add(er);
            }
            lista.setItems(eredmenyLista);
            lekerdezettAlkalmazottak.close();
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }

    public void torles(){
        String torlenoAlkalmazottNeve=lista.getSelectionModel().getSelectedItem();
        Statement stmt=null;

        try{
            stmt = conn.createStatement();
            String sql = "DELETE FROM alkalmazott WHERE nev LIKE '" + torlenoAlkalmazottNeve + "'";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
        dolgozokBetoltese();
    }

    public void hozzaad(){
        String nevValue = nev.getText();
        String nemValue = nem.getValue().trim().toLowerCase();
        String munkahelyValue = munkahely.getValue();
        String vegzettsegValue = vegzettseg.getValue();

        try{
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO alkalmazott (nev, nem, munkahely_id, vegzettseg_id) VALUES ('"
                    + nevValue + "', '"
                    + nemValue.charAt(0) + "', "
                    + "(SELECT id FROM munkahely WHERE munkahely LIKE '" + munkahelyValue + "'), "
                    + "(SELECT id FROM vegzettseg WHERE vegzettseg LIKE '" + vegzettsegValue + "'))";
            stmt.executeUpdate(sql);
            stmt.close();

            lista.getItems().add(nevValue);

            nev.clear();
            nem.getSelectionModel().clearSelection();
            munkahely.getSelectionModel().clearSelection();
            vegzettseg.getSelectionModel().clearSelection();
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
        dolgozokBetoltese();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            DatabaseManagement.setMunkahely(munkahely);
            DatabaseManagement.setVegzettseg(vegzettseg);
            DatabaseManagement.setNem(nem);
            dolgozokBetoltese();
        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Adatbázis hiba");
            alert.setContentText("Hiba oka: " + e);
            alert.show();
        }
    }
}
