package com.example.udemyjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HandleEvent extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();


        OKHandlerClass handler1 = new OKHandlerClass();
        CancelHandlerClass handler2 = new CancelHandlerClass();
        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");
        btOK.setOnAction(handler1);
        btCancel.setOnAction(handler2);
        gridPane.add(btOK,0,0);
        gridPane.add(btCancel,0,1);
        Scene scene = new Scene(gridPane,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    class OKHandlerClass implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            System.out.println("Ok button clicked");
        }
    }
    class CancelHandlerClass implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            System.out.println("Cancel button clicked");
        }
    }
}
