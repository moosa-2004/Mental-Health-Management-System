package com.example.mentalhealthapp;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AssessmentScene {
    private Scene scene;

    public AssessmentScene(Stage primaryStage, String patientName) {
        Label title = new Label("Mental Health Assessment");

        Label q1 = new Label("1. How often do you feel stressed?");
        ComboBox<String> a1 = new ComboBox<>();
        a1.getItems().addAll("Never", "Sometimes", "Often");

        Label q2 = new Label("2. Do you have trouble sleeping?");
        ComboBox<String> a2 = new ComboBox<>();
        a2.getItems().addAll("No", "Occasionally", "Frequently");

        Button submit = new Button("Submit");
        Label result = new Label();

        submit.setOnAction(e -> {
            result.setText("Assessment submitted. Thank you!");
        });

        Button back = new Button("Back");
        back.setOnAction(e -> {
            DashboardScene dashboard = new DashboardScene(primaryStage, "Patient", patientName);
            primaryStage.setScene(dashboard.getScene());
        });

        VBox layout = new VBox(10, title, q1, a1, q2, a2, submit, result, back);
        layout.setStyle("-fx-padding: 20;");
        this.scene = new Scene(layout, 400, 300);
    }

    public Scene getScene() {
        return this.scene;
    }
}
