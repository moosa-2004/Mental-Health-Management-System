package com.example.mentalhealthapp;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VideoScene {
    private Scene scene;

    public VideoScene(Stage primaryStage, String patientName) {
        Label label = new Label("Mental Health Videos");

        ListView<String> videoList = new ListView<>();
        videoList.getItems().addAll(
                "Coping with Anxiety",
                "Understanding Depression",
                "Mindfulness and Relaxation"
        );

        Button back = new Button("Back");
        back.setOnAction(e -> {
            DashboardScene dashboard = new DashboardScene(primaryStage, "Patient", patientName);
            primaryStage.setScene(dashboard.getScene());
        });

        VBox layout = new VBox(10, label, videoList, back);
        layout.setStyle("-fx-padding: 20;");
        this.scene = new Scene(layout, 400, 250);
    }

    public Scene getScene() {
        return this.scene;
    }
}
