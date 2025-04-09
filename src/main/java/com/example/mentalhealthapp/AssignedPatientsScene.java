package com.example.mentalhealthapp;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AssignedPatientsScene {
    private Scene scene;

    public AssignedPatientsScene(Stage primaryStage, String therapistName) {
        Label label = new Label("Assigned Patients");

        ListView<String> patientList = new ListView<>();
        patientList.getItems().addAll("Alice Johnson", "Bob Smith", "Charlie Brown");

        Button back = new Button("Back");
        back.setOnAction(e -> {
            DashboardScene dashboard = new DashboardScene(primaryStage, "Therapist", therapistName);
            primaryStage.setScene(dashboard.getScene());
        });

        VBox layout = new VBox(10, label, patientList, back);
        layout.setStyle("-fx-padding: 20;");
        this.scene = new Scene(layout, 400, 250);
    }

    public Scene getScene() {
        return this.scene;
    }
}
