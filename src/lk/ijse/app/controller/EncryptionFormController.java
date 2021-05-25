package lk.ijse.app.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import lk.ijse.app.util.Cryptography;
import lk.ijse.crypto.Dep7Crypto;


public class EncryptionFormController {
    public TextField txtText;
    public TextField txtKey;
    public TextField txtCipher;

    public void btnEncrypt_OnAction(ActionEvent actionEvent) {
        String text = txtText.getText();
        String key  = txtKey.getText();

        if(text.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please enter valid text", ButtonType.OK).show();
            txtText.requestFocus();
            return;
        }

        if(key.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please enter valid key", ButtonType.OK).show();
            txtText.requestFocus();
            return;
        }
        Cryptography.key = key;
//        txtCipher.setText(Dep7Crypto.encrypt(text,key));
        txtCipher.setText(Cryptography.encrypt(text,key));


    }
}
