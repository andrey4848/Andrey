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

public class ControllerZagadki {
    @FXML
    private Label poyasn1;

    @FXML
    private Button Anna;

    @FXML
    private Button Sasha;

    @FXML
    private Button gay;

    @FXML
    private Button ShowMustGoOn1;

    @FXML
    private ImageView yesBro1;

    @FXML
    private ImageView noBro1;
    public void initialize() {
        poyasn1.setVisible(false);
noBro1.setVisible(false);
        ShowMustGoOn1.setVisible(false);
        yesBro1.setVisible(false);
gay.setOnAction(actionEvent -> {
    noBro1.setVisible(true);
    gay.setVisible(false);
});
        Sasha.setOnAction(actionEvent -> {
            noBro1.setVisible(true);
            Sasha.setVisible(false);
        });
        Anna.setOnAction(actionEvent -> {
            ShowMustGoOn1.setVisible(true);
            yesBro1.setVisible(true);
            noBro1.setVisible(false);
            Anna.setVisible(false);
            poyasn1.setVisible(true);
        });
        ShowMustGoOn1.setOnAction(actionEvent -> {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("zagadki2.fxml"));
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
