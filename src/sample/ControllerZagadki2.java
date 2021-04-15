package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerZagadki2 {

    @FXML
    private Button veliki;

    @FXML
    private Button teatral;

    @FXML
    private Button oba;

    @FXML
    private Label poyasn2;

    @FXML
    private ImageView noBro2;

    @FXML
    private ImageView yesBro2;

    @FXML
    private Button dal;
    public void initialize() {
        poyasn2.setVisible(false);
        noBro2.setVisible(false);
        dal.setVisible(false);
        yesBro2.setVisible(false);
        veliki.setOnAction(actionEvent -> {
            noBro2.setVisible(true);
            veliki.setVisible(false);
        });
        teatral.setOnAction(actionEvent -> {
            noBro2.setVisible(true);
            teatral.setVisible(false);
        });
        oba.setOnAction(actionEvent -> {
           dal.setVisible(true);
            yesBro2.setVisible(true);
            noBro2.setVisible(false);
            oba.setVisible(false);
            poyasn2.setVisible(true);
        });
        dal.setOnAction(actionEvent -> {
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("zagadka3.fxml"));
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
    }
}
