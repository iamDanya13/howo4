package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;

    public void clickSend(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.requestFocus();


    }

    public void click1(ActionEvent actionEvent) {
        textArea.appendText("Привет, давно тебя не видел! Как у тебя дела?\n");


    }
}