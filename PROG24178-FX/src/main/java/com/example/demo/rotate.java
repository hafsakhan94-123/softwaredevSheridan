package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class rotate extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane pane = new BorderPane();
        Button btn = new Button("Ok");
        //      pane.getChildren().add(btn);
        pane.setCenter(btn);
        pane.setRotate(45);
        pane.setStyle("-fx-border-color: red; -fx-background-color: grey");
        Scene scene = new Scene(pane,200,300);

        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
