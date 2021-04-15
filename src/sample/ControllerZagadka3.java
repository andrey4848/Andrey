package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerZagadka3 {
    @FXML
    void ButtonPressed() {
        answ1.setText("TRUE");
    }

    @FXML
//when ENTER is pressed the button is activated
    void textFieldEnterPressed() {
        ButtonPressed();
    }

    @FXML
    private AnchorPane first;

    @FXML
    private TextField answ1;


    public void initialize() {
        answ1.setOnAction(actionEvent -> {
            if (answ1.getText().equals(1)) {

            }
        });
    }
}

