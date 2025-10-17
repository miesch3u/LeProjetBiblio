package com.idmc.projetbiblio;

import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerNextArrowBasicTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import com.jfoenix.controls.JFXButton;

import java.io.IOException;

/**
 * Application lançant le projet
 */
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        BorderPane root = new BorderPane();

        JFXButton[] jfxButtons = {
                new JFXButton("Some text"),
                new JFXButton("Some text"),
                new JFXButton("Some text")
        };

        JFXHamburger hamburger = new JFXHamburger();
        HamburgerNextArrowBasicTransition transition = new HamburgerNextArrowBasicTransition(hamburger);
        transition.setRate(-1);

        hamburger.setAlignment(Pos.CENTER_LEFT);
        hamburger.setPadding(new Insets(5));
        hamburger.setStyle("-fx-background-color: #fff;");

        hamburger.setOnMouseClicked(event -> {
            transition.setRate(transition.getRate() * -1);
            transition.play();
            if (transition.getRate() == -1) {
                for (JFXButton jfxButton : jfxButtons) {
                    jfxButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
                }
            } else {
                for (JFXButton jfxButton : jfxButtons) {
                    jfxButton.setContentDisplay(ContentDisplay.LEFT);
                }
            }
        });

        ScrollPane scrollPane = new ScrollPane();
        VBox vBox = new VBox();
        scrollPane.setContent(vBox);

        vBox.getStyleClass().add("content_scene_left");
        vBox.getChildren().add(hamburger);
        vBox.getChildren().addAll(jfxButtons);

        for (JFXButton jfxButton : jfxButtons) {
            jfxButton.setMaxWidth(Double.MAX_VALUE);
            jfxButton.setRipplerFill(Color.valueOf("#40E0D0"));
            VBox.setVgrow(jfxButton, Priority.ALWAYS);
            jfxButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        }
        vBox.setFillWidth(true);

        Label labelHoverOverTest = new Label("Testing label");

        VBox vbox2 = new VBox();
        vbox2.getChildren().addAll(labelHoverOverTest);
        vbox2.setAlignment(Pos.CENTER_LEFT);

        root.setLeft(scrollPane);
        root.setCenter(vbox2);

        Scene scene = new Scene(root);

        stage.setMinWidth(400);
        stage.setMinHeight(400);

        stage.setTitle("Application Bibliothèque");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(HelloApplication.class, args);
    }
}
