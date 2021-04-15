package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerMenu {

    @FXML
    private Button zgd;

    @FXML
    private Button pl;

    @FXML
    private Button authors;

    @FXML
    private Button exit;
    public void initialize() {
zgd.setOnAction(actionEvent -> {
    ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("zagadki.fxml"));
    try {
        loader.load();
    } catch (IOException e) {
        e.printStackTrace();
    }
    Parent root = loader.getRoot();
    Stage stage = new Stage();
    stage.setScene((new Scene(root, 600, 400)));
    stage.show();
});
        exit.setOnAction(actionEvent -> {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
        });
        authors.setOnAction(actionEvent -> {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("authorsFxml.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene((new Scene(root, 650, 400)));
            stage.show();
        });
    }
}
