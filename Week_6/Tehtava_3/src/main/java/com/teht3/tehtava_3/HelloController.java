package com.teht3.tehtava_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    public ImageView savoniaLogo;


    public ImageView getSavoniaLogo() {
        return savoniaLogo;
    }

    public void setSavoniaLogo(ImageView savoniaLogo) {
        this.savoniaLogo = savoniaLogo;
    }

    public void initialize() {
        assert savoniaLogo != null;
        assert type != null;
        type.getItems().add("tietokone");
        type.getItems().add("hiiri");
        type.getItems().add("monitori");
//        Image image = new Image("jetbrains://idea/navigate/reference?project=Tehtava_3&path=savonia.png");
//        ImageView image = new ImageView("src/main/java/com/teht3/tehtava_3/savonia.png");
//        setSavoniaLogo(new ImageView("https://icons8.com/icon/eeicC8WzWxlz/toggle-off"));
//        setSavoniaLogo(image);
//        savoniaLogo.setImage(image);
        savoniaLogo.setLayoutX(0);
        savoniaLogo.setLayoutY(0);
        savoniaLogo.setPreserveRatio(true);
    }


    @FXML
    private ComboBox<String> type;

    @FXML
    private Label saveText;

    @FXML
    public Button closeButton;

    @FXML
    public Button saveButton;


    @FXML
    public void onCloseButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void onSaveButtonAction(ActionEvent event) {
        saveText.setText("Saved");
    }


//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        assert savoniaLogo != null;
//        assert type != null;
//        type.getItems().add("tietokone");
//        type.getItems().add("hiiri");
//        type.getItems().add("monitori");
//    }
}