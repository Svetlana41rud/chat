package com.example.chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {
    @FXML
    private TextArea messegeArea;
    @FXML
    private TextField messegeField;

    @FXML
    private void sendButtonClick(ActionEvent actionEvent) {
      final  String text = messegeField.getText();
        messegeArea.appendText(text + "\n");
        messegeField.clear();
        messegeField.requestFocus();
    }
}