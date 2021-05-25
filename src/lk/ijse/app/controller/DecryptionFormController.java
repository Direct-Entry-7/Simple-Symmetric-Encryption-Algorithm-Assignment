package lk.ijse.app.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import lk.ijse.app.util.Cryptography;


public class DecryptionFormController {
    public TextField txtCipher;
    public TextField txtKey;
    public TextField txtText;

    public void btnDecrypt_OnAction(ActionEvent actionEvent) {
        /*
        * 1.Generate keyCode using entered key
        * 2.Remove generated key code from each character in the cipher text
        * 3. New text assign to cipher text
        * 4. Get the original text by reducing -5 from the actual text
        * 5. Get the original Text
        * */
        String cipherText = txtCipher.getText();
        String key = txtKey.getText();


        if (cipherText.trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please enter valid cipher", ButtonType.OK).show();
            txtCipher.requestFocus();
            return;
        }

        if (key.trim().isEmpty() || !key.equals(Cryptography.key)) {
            new Alert(Alert.AlertType.ERROR, "Please enter valid key", ButtonType.OK).show();
            txtText.requestFocus();
            return;
        } else{
            txtText.setText(Cryptography.decrypt(cipherText, key));
        }


    }
}
