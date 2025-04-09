package com.example.mentalhealthapp;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewAppointmentsScene {
    private Scene scene;

    public ViewAppointmentsScene(Stage primaryStage, String adminName) {
        Label label = new Label("All Appointments");

        ListView<String> appointments = new ListView<>();
        appointments.getItems().addAll(
                "Alice Johnson - Dr. Emily Clark - 2025-04-10",
                "Bob Smith - Dr. John Doe - 2025-04-11"
        );

        Button back = new Button("Back");
        back.setOnAction(e -> {
            DashboardScene dashboard = new DashboardScene(primaryStage, "Admin", adminName);
            primaryStage.setScene(dashboard.getScene());
        });

        VBox layout = new VBox(10, label, appointments, back);
        layout.setStyle("-fx-padding: 20;");
        this.scene = new Scene(layout, 400, 250);
    }

    public Scene getScene() {
        return this.scene;
    }
}
