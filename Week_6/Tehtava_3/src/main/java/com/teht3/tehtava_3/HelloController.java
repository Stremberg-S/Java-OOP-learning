package com.teht3.tehtava_3;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    @FXML
    private ImageView savoniaLogo;

    @FXML
    private TextField productName;

    @FXML
    private ComboBox<String> productType;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField productPrice;

    @FXML
    private TextField productBuyer;

    @FXML
    private Label saveText;

    @FXML
    public Button closeButton;

    @FXML
    public Button saveButton;


    @FXML
    public void onCloseButtonAction() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void onSaveButtonAction() {
        int counter = 0;
        String name = null, type = null, date = null, buyer = null;
        double price = 0;

        // VALIDATING
        if (productName.getText().isEmpty()) {
            productName.setPromptText("Tuotteen nimi puuttuu.. ");
            productName.setStyle("-fx-prompt-text-fill: rgb(247,0,111);");
            counter++;
        } else name = productName.getText();

        if (productType.getValue() == null) {
            productType.setPromptText("Tuotteen tyyppi ei valittu.. ");
            productType.setStyle("-fx-prompt-text-fill: rgb(247,0,111);");
            counter++;
        } else type = String.valueOf(productType.getValue());

        if (datePicker.getValue() == null) {
            datePicker.setPromptText("Päiväys puuttuu.. ");
            datePicker.setStyle("-fx-prompt-text-fill: rgb(247,0,111);");
            counter++;
        } else date = String.valueOf(LocalDate.parse(datePicker.getValue().toString()));

        if (productPrice.getText().isEmpty()) {
            productPrice.setPromptText("Tuotteen hinta puuttuu.. ");
            productPrice.setStyle("-fx-prompt-text-fill: rgb(247,0,111)");
            counter++;
        } else {
            try {
                price = Double.parseDouble(productPrice.getText());
            } catch (NumberFormatException e) {
                productPrice.setText("");
                productPrice.setPromptText("Vain numerot käy.. ");
                productPrice.setStyle("-fx-prompt-text-fill: rgb(247,0,111)");
                counter++;
            }
        }

        if (productBuyer.getText().isEmpty()) {
            productBuyer.setPromptText("Tuotteen ostaja puuttuu.. ");
            productBuyer.setStyle("-fx-prompt-text-fill: rgb(247,0,111);");
            counter++;
        } else buyer = productBuyer.getText();


        // CREATE A VALID OBJECT AND SAVE
        if (counter == 0) {
            Tuote t = new Tuote(name, type, date, price, new Henkilo(buyer));
            System.out.println(t);
            saveText.setText("Saved..");
        }


        // FADE
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0), e -> saveText.setText("")));
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
        Platform.runLater(() -> {
            productType.requestFocus();
        });
        assert savoniaLogo != null;
        assert productType != null;
        productType.getItems().add("tietokone");
        productType.getItems().add("hiiri");
        productType.getItems().add("monitori");
        datePicker.setValue(LocalDate.now());

        Image image = new Image(new File(
                "src/main/java/com/teht3/tehtava_3/img/savonia.png").toURI().toString());
        savoniaLogo.setImage(image);
        savoniaLogo.setFitHeight(240);
        savoniaLogo.setFitWidth(415);
        savoniaLogo.setPreserveRatio(true);
    }
}