package sample;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;



import java.io.IOException;

public class Controller {

    @FXML
    private Button false3;

    @FXML
    private Button false2;

    @FXML
    private Button false1;

    @FXML
    private Button buttonStart1;

    public void initialize(){
        false2.setVisible(false);
        false3.setVisible(false);
        buttonStart1.setVisible(false);
        false1.setOnAction(actionEvent -> {
            false3.setVisible(true);
            false1.setVisible(false);
        });
        false3.setOnAction(actionEvent -> {
            false2.setVisible(true);
            false3.setVisible(false);
        });
        false2.setOnAction(actionEvent -> {
            buttonStart1.setVisible(true);
            false2.setVisible(false);
        });
        buttonStart1.setOnAction(actionEvent -> {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("menu.fxml"));
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
