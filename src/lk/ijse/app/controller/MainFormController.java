package lk.ijse.app.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {

    public AnchorPane contextOfHome;

    public void btnEncryption_OnAction(ActionEvent actionEvent) throws IOException {
        loadForm("/lk/ijse/app/view/EncryptionForm.fxml");
    }



    public void btnDecryption_OnAction(ActionEvent actionEvent) throws IOException {
        loadForm("/lk/ijse/app/view/DecryptionForm.fxml");
    }

    private void loadForm(String path) throws IOException {
        Stage stage = new Stage();
        Parent encryptionForm = FXMLLoader.load(this.getClass().getResource(path));
        Scene scene = new Scene(encryptionForm);
        stage.setScene(scene);
        stage.setTitle("Encryption");
        stage.centerOnScreen();
        stage.initOwner(this.contextOfHome.getScene().getWindow());
        stage.show();
    }
}
