package com.example.mentalhealthapp;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BookAppointmentScene {
    private Scene scene;

    public BookAppointmentScene(Stage primaryStage, String patientName) {
        Label label = new Label("Book an Appointment");

        TextField therapistField = new TextField();
        therapistField.setPromptText("Therapist Name");

        DatePicker datePicker = new DatePicker();

        Button bookButton = new Button("Confirm Booking");
        Label confirmation = new Label();

        bookButton.setOnAction(e -> {
            String therapist = therapistField.getText();
            String date = datePicker.getValue() != null ? datePicker.getValue().toString() : "";
            if (!therapist.isEmpty() && !date.isEmpty()) {
                confirmation.setText("Appointment booked with " + therapist + " on " + date);
            } else {
                confirmation.setText("Please fill in all fields.");
            }
        });

        Button back = new Button("Back");
        back.setOnAction(e -> {
            DashboardScene dashboard = new DashboardScene(primaryStage, "Patient", patientName);
            primaryStage.setScene(dashboard.getScene());
        });

        VBox layout = new VBox(10, label, therapistField, datePicker, bookButton, confirmation, back);
        layout.setStyle("-fx-padding: 20;");
        this.scene = new Scene(layout, 400, 250);
    }

    public Scene getScene() {
        return this.scene;
    }
}
