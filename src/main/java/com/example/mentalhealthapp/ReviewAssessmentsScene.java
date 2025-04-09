package com.example.mentalhealthapp;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ReviewAssessmentsScene {
    private Scene scene;

    public ReviewAssessmentsScene(Stage primaryStage, String therapistName) {
        Label label = new Label("Patient Assessments");

        TextArea assessmentArea = new TextArea();
        assessmentArea.setText("Alice Johnson:\n - Stress Level: Often\n - Sleep Issues: Frequently\n\nBob Smith:\n - Stress Level: Sometimes\n - Sleep Issues: Occasionally");
        assessmentArea.setEditable(false);

        Button back = new Button("Back");
        back.setOnAction(e -> {
            DashboardScene dashboard = new DashboardScene(primaryStage, "Therapist", therapistName);
            primaryStage.setScene(dashboard.getScene());
        });

        VBox layout = new VBox(10, label, assessmentArea, back);
        layout.setStyle("-fx-padding: 20;");
        this.scene = new Scene(layout, 400, 300);
    }

    public Scene getScene() {
        return this.scene;
    }
}
