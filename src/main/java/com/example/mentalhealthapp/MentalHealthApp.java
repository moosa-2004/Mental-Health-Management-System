package com.example.mentalhealthapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class MentalHealthApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        LoginScene loginScene = new LoginScene(primaryStage);
        primaryStage.setTitle("Mental Health Management System");
        primaryStage.setScene(loginScene.getScene());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
