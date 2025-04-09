package com.example.mentalhealthapp;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UploadVideoScene {
    private Scene scene;

    public UploadVideoScene(Stage primaryStage, String therapistName) {
        Label label = new Label("Upload Mental Health Video");

        TextField titleField = new TextField();
        titleField.setPromptText("Video Title");

        TextField linkField = new TextField();
        linkField.setPromptText("Video Link (e.g., YouTube)");

        Button uploadBtn = new Button("Upload");
        Label message = new Label();

        uploadBtn.setOnAction(e -> {
            if (!titleField.getText().isEmpty() && !linkField.getText().isEmpty()) {
                message.setText("Video uploaded: " + titleField.getText());
            } else {
                message.setText("Please fill in all fields.");
            }
        });

        Button back = new Button("Back");
        back.setOnAction(e -> {
            DashboardScene dashboard = new DashboardScene(primaryStage, "Therapist", therapistName);
            primaryStage.setScene(dashboard.getScene());
        });

        VBox layout = new VBox(10, label, titleField, linkField, uploadBtn, message, back);
        layout.setStyle("-fx-padding: 20;");
        this.scene = new Scene(layout, 400, 280);
    }

    public Scene getScene() {
        return this.scene;
    }
}
