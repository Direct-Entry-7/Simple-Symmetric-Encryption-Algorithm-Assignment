package lk.ijse.app.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import lk.ijse.app.util.Cryptography;


public class EncryptionFormController {
    public TextField txtText;
    public TextField txtKey;
    public TextField txtCipher;

    public void btnEncrypt_OnAction(ActionEvent actionEvent) {
        /*
         * 1. Loop plain text and adding each char + 5 and assign to variable called firstText
         * 2. Reverse Plain Text
         * 3. Loop reversed Text and adding each char +10 and assign to variable called secondText
         * 4. create variable called concatenatedText and assign  (String concatenatedText= secondText + key + firstText;)
         * 5. Generate keyNumber using entered key
         * 6. Add generated key number to each char in concatenated text
         *
         * */
        String text = txtText.getText();
        String key = txtKey.getText();

        if (text.trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please enter valid text", ButtonType.OK).show();
            txtText.requestFocus();
            return;
        }

        if (key.trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please enter valid key", ButtonType.OK).show();
            txtText.requestFocus();
            return;
        } else {
            Cryptography.key = key;
            txtCipher.setText(Cryptography.encrypt(text, key));
        }

    }
}
