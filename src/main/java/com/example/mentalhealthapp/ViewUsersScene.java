package com.example.mentalhealthapp;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewUsersScene {
    private Scene scene;

    public ViewUsersScene(Stage primaryStage, String adminName) {
        Label label = new Label("All Registered Users");

        ListView<String> userList = new ListView<>();
        userList.getItems().addAll(
                "Patient: Alice Johnson",
                "Patient: Bob Smith",
                "Therapist: Dr. Emily Clark",
                "Therapist: Dr. John Doe"
        );

        Button back = new Button("Back");
        back.setOnAction(e -> {
            DashboardScene dashboard = new DashboardScene(primaryStage, "Admin", adminName);
            primaryStage.setScene(dashboard.getScene());
        });

        VBox layout = new VBox(10, label, userList, back);
        layout.setStyle("-fx-padding: 20;");
        this.scene = new Scene(layout, 400, 250);
    }

    public Scene getScene() {
        return this.scene;
    }
}
