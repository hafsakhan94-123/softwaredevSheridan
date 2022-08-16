package com.example.udemyjavafx;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class BorderPaneUdemy extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage1) {



        //Scene scene1 = new Scene(new GridPane(),400,400);

        FlowPane pane = new FlowPane(Orientation.HORIZONTAL);
        TilePane tilePane = new TilePane(); // add space between buttons
        StackPane stackPane = new StackPane();
        Button btn1 = new Button("Button one");
        Button btn2 = new Button("Button two");
        Button btn3 = new Button("Button three");
        Button btn4 = new Button("Button four");
        Button btn5 = new Button("Button five");
        Button btn6 = new Button("Button six");
        Button btn7 = new Button("Button seven");
        Button btn8 = new Button("Button eight");
        Button btn9 = new Button("Button nine");
        Button btn10 = new Button("Button ten");
        Label label = new Label("This is a text.");

        btn1.setTextFill(Color.RED);
        label.setBackground(Background.fill(Color.TURQUOISE));
//        pane.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10);
//        tilePane.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10);
       // VBox vbox = new VBox(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10);
        stackPane.getChildren().addAll(label,btn1); // the last node comes on top using stackpane
//        HBox hbox = new HBox(btn,btn1);
//        BorderPane borderPane1 = new BorderPane();

//        Label label1 = new Label("This a new label");
//        Label label2 = new Label("This a very loooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooong text.");
//        borderPane1.setCenter(btn);
//        borderPane1.setBottom(btn1);
//        borderPane1.setTop(label);
//        borderPane1.setRight(label1);
//        borderPane1.setLeft(label2);
//        label.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.DASHED,null,null)));
//        Scene scene1 = new Scene(borderPane1,400,400);

        //btn.setPadding(new Insets(10));
        Scene scene1 = new Scene(stackPane,400,400);

        primaryStage1.setScene(scene1);
        primaryStage1.show();
    }
}
