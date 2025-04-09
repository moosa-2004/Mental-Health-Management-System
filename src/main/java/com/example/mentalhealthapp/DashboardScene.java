package com.example.mentalhealthapp;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class DashboardScene {
    private Scene scene;

    public DashboardScene(Stage primaryStage, String role, String name) {
        Label welcome = new Label("Welcome, " + name + " (" + role + ")");

        VBox layout = new VBox(10);
        layout.getChildren().add(welcome);

        if (role.equals("Patient")) {
            Button bookBtn = new Button("Book Appointment");
            bookBtn.setOnAction(e -> {
                BookAppointmentScene book = new BookAppointmentScene(primaryStage, name);
                primaryStage.setScene(book.getScene());
            });

            Button assessBtn = new Button("Take Assessment");
            assessBtn.setOnAction(e -> {
                AssessmentScene assess = new AssessmentScene(primaryStage, name);
                primaryStage.setScene(assess.getScene());
            });

            Button videosBtn = new Button("View Videos");
            videosBtn.setOnAction(e -> {
                VideoScene video = new VideoScene(primaryStage, name);
                primaryStage.setScene(video.getScene());
            });

            layout.getChildren().addAll(bookBtn, assessBtn, videosBtn);
        }
        else if (role.equals("Therapist")) {
            Button viewPatientsBtn = new Button("View Assigned Patients");
            viewPatientsBtn.setOnAction(e -> {
                AssignedPatientsScene patients = new AssignedPatientsScene(primaryStage, name);
                primaryStage.setScene(patients.getScene());
            });

            Button reviewAssessBtn = new Button("Review Assessments");
            reviewAssessBtn.setOnAction(e -> {
                ReviewAssessmentsScene assess = new ReviewAssessmentsScene(primaryStage, name);
                primaryStage.setScene(assess.getScene());
            });

            Button uploadVideoBtn = new Button("Upload Video");
            uploadVideoBtn.setOnAction(e -> {
                UploadVideoScene upload = new UploadVideoScene(primaryStage, name);
                primaryStage.setScene(upload.getScene());
            });

            layout.getChildren().addAll(viewPatientsBtn, reviewAssessBtn, uploadVideoBtn);
        }
        else if (role.equals("Admin")) {
            Button usersBtn = new Button("View All Users");
            usersBtn.setOnAction(e -> {
                ViewUsersScene viewUsers = new ViewUsersScene(primaryStage, name);
                primaryStage.setScene(viewUsers.getScene());
            });

            Button apptBtn = new Button("View All Appointments");
            apptBtn.setOnAction(e -> {
                ViewAppointmentsScene viewAppts = new ViewAppointmentsScene(primaryStage, name);
                primaryStage.setScene(viewAppts.getScene());
            });

            Button manageBtn = new Button("Manage Bookings");
            manageBtn.setOnAction(e -> {
                ManageBookingsScene manageBookings = new ManageBookingsScene(primaryStage, name);
                primaryStage.setScene(manageBookings.getScene());
            });

            layout.getChildren().addAll(usersBtn, apptBtn, manageBtn);
        }


        Button logout = new Button("Logout");
        logout.setOnAction(e -> {
            LoginScene loginScene = new LoginScene(primaryStage);
            primaryStage.setScene(loginScene.getScene());
        });

        layout.getChildren().add(logout);
        layout.setStyle("-fx-padding: 20;");
        this.scene = new Scene(layout, 400, 250);
    }

    public Scene getScene() {
        return this.scene;
    }
}
