package com.example.javafx2025040213i2;

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

public class NoiMunkatarsakController implements Initializable {
    @FXML
    private ListView<String> noiLista;

    private Connection conn=DatabaseConnection.getConnection();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Statement stmt=null;
        ObservableList<String> lista= FXCollections.observableArrayList();

        try{
            stmt=conn.createStatement();
            ResultSet noiSQLLekerdezesEredmeny=stmt.executeQuery("SELECT nev FROM alkalmazott WHERE munkahely_id=1 AND nem LIKE 'n'");

            while(noiSQLLekerdezesEredmeny.next()){
                String er=noiSQLLekerdezesEredmeny.getString("nev");
                lista.add(er);
            }
            noiLista.setItems(lista);
            noiSQLLekerdezesEredmeny.close();
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }
}
