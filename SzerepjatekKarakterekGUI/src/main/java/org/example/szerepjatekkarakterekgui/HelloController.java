package org.example.szerepjatekkarakterekgui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ListView<String> karakterek;
    @FXML
    private ComboBox<Faj> fajok;

    private ObservableList<Faj> fajokAdatbazisbol;
    private ObservableList<String> szurtKarakterek;

    private Connection conn=DatabaseConnection.getConnection();

    public void szures(){
        Faj f=fajok.getSelectionModel().getSelectedItem();
        if(f.getId()==0){
            Alert a=new Alert(Alert.AlertType.ERROR);
            a.setTitle("Kitöltési hiba hiba");
            a.setContentText("Válasszon egy fajt a szűréshez!");
            a.show();
        }else{
            try{
                szurtKarakterek=FXCollections.observableArrayList();
                String query = "SELECT * FROM karakterek WHERE faj_id=?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, f.getId());
                ResultSet rs= ps.executeQuery();
                while (rs.next()){
                    szurtKarakterek.add(rs.getString("nev")+"("+rs.getInt("szint")+")");
                }
                rs.close();
                ps.close();
                karakterek.setItems(szurtKarakterek);
            } catch (SQLException sqle) {
                Alert a=new Alert(Alert.AlertType.ERROR);
                a.setTitle("SQL hiba");
                a.setContentText(sqle.toString());
                a.show();
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fajokAdatbazisbol= FXCollections.observableArrayList();
        fajokAdatbazisbol.add(new Faj(0,"Válasszon fajt"));
        String query = "SELECT * FROM fajok";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(query);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                Faj f = new Faj(rs.getInt("id"), rs.getString("faj"));
                fajokAdatbazisbol.add(f);
            }
            rs.close();
            ps.close();
            fajok.setItems(fajokAdatbazisbol);
            fajok.getSelectionModel().selectFirst();
        } catch (SQLException sqle) {
            Alert a=new Alert(Alert.AlertType.ERROR);
            a.setTitle("SQL hiba");
            a.setContentText(sqle.toString());
            a.show();
        }
    }
}