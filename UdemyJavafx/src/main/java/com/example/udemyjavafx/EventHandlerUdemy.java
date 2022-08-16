package com.example.udemyjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EventHandlerUdemy extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage eventStage) {
        eventStage.setTitle("Hello");

        GridPane gridPaneEvent = new GridPane();
        Scene sceneEvent = new Scene(gridPaneEvent,400,400);

        TextField textField = new TextField();
        Button btn = new Button("Say Hello");
        Button btn1 = new Button("Bye Button");
        gridPaneEvent.add(textField,0,0);
        gridPaneEvent.add(btn,0,1);
        gridPaneEvent.add(btn1,0,2);



        btn.setOnAction(event -> {


            EventClassUdemy.onButtonClick();
        });

        btn1.setOnAction(event -> {
            EventClassUdemy.onButtonBye();
        });

        eventStage.setScene(sceneEvent);
        eventStage.show();
    }
}
