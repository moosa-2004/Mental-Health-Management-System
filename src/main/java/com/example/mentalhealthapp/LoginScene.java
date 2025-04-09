package com.example.mentalhealthapp;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginScene {
    private Scene scene;

    public LoginScene(Stage primaryStage) {
        Label label = new Label("Select Role:");
        ComboBox<String> roleBox = new ComboBox<>();
        roleBox.getItems().addAll("Patient", "Therapist", "Admin");

        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");

        TextField nameField2 = new TextField();
        nameField2.setPromptText("Email");

        TextField nameField3 = new TextField();
        nameField3.setPromptText("password");

        Button loginButton = new Button("Login");

        loginButton.setOnAction(e -> {
            String role = roleBox.getValue();
            String name = nameField.getText();

            if (role != null && !name.isEmpty()) {
                DashboardScene dashboard = new DashboardScene(primaryStage, role, name);
                primaryStage.setScene(dashboard.getScene());
            }
        });

        VBox layout = new VBox(5, label, roleBox, nameField,nameField2, nameField3, loginButton);
        layout.setStyle("-fx-padding: 20;");
        this.scene = new Scene(layout, 300, 200);
    }

    public Scene getScene() {
        return this.scene;
    }
}
