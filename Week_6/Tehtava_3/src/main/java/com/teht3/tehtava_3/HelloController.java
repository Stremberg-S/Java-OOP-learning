package com.teht3.tehtava_3;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    Image image = new Image(new File(
            "src/main/java/com/teht3/tehtava_3/img/savonia.png").toURI().toString());

    @FXML
    private ImageView savoniaLogo;

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
        saveText.setText("Saved..");

        // FADE
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0), e -> {
            saveText.setText("");
        }));
        // FADE-SLOWDOWN
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(3), saveText);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.0);

        // Chain the Timeline and FadeTransition together
        timeline.setOnFinished(e -> fadeTransition.play());
        timeline.play();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        assert savoniaLogo != null;
        assert type != null;
        type.getItems().add("tietokone");
        type.getItems().add("hiiri");
        type.getItems().add("monitori");

        savoniaLogo.setImage(image);
        savoniaLogo.setFitHeight(240);
        savoniaLogo.setFitWidth(415);
        savoniaLogo.setPreserveRatio(true);
    }
}