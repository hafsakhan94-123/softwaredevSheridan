package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class ShowLine extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene and place it in the stage
        Scene scene = new Scene(new LinePane(), 200, 200);
        primaryStage.setTitle("ShowLine"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
      }
}

class LinePane extends Pane {
    public LinePane() {
        Text text1 = new Text(10,10,"This is Line 1");
        Text text2 = new Text(10,10,"This is Line 2");
        Line line1 = new Line(10, 10, 10, 10);
        line1.endXProperty().bind(widthProperty().subtract(10));
        line1.endYProperty().bind(heightProperty().subtract(10));
        line1.setStrokeWidth(5);
        line1.setStroke(Color.GREEN);
        getChildren().add(line1);
        text1.setRotate(45);
        text1.setX(20);
        text1.setY(40);
        text1.setStroke(Color.GREEN);
        getChildren().add(text1);

        Line line2 = new Line(10, 10, 10, 10);
        line2.startXProperty().bind(widthProperty().subtract(10));
        line2.endYProperty().bind(heightProperty().subtract(10));
        line2.setStrokeWidth(5);
        line2.setStroke(Color.GREEN);
        getChildren().add(line2);
        text2.setY(170);
        text2.setX(20);
        text2.setRotate(-45);
        text2.setStroke(Color.GREEN);
        getChildren().add(text2);

    }
}