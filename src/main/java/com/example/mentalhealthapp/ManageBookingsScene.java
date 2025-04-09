package com.example.mentalhealthapp;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ManageBookingsScene {
    private Scene scene;

    public ManageBookingsScene(Stage primaryStage, String adminName) {
        Label label = new Label("Manage Bookings");

        ListView<String> bookingList = new ListView<>();
        bookingList.getItems().addAll(
                "Alice Johnson - Dr. Emily Clark - 2025-04-10",
                "Bob Smith - Dr. John Doe - 2025-04-11"
        );

        Button cancelBtn = new Button("Cancel Selected Booking");
        Label msg = new Label();

        cancelBtn.setOnAction(e -> {
            String selected = bookingList.getSelectionModel().getSelectedItem();
            if (selected != null) {
                bookingList.getItems().remove(selected);
                msg.setText("Booking cancelled.");
            } else {
                msg.setText("Please select a booking to cancel.");
            }
        });

        Button back = new Button("Back");
        back.setOnAction(e -> {
            DashboardScene dashboard = new DashboardScene(primaryStage, "Admin", adminName);
            primaryStage.setScene(dashboard.getScene());
        });

        VBox layout = new VBox(10, label, bookingList, cancelBtn, msg, back);
        layout.setStyle("-fx-padding: 20;");
        this.scene = new Scene(layout, 400, 300);
    }

    public Scene getScene() {
        return this.scene;
    }
}
