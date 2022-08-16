package com.example.udemyjavafx;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControlsUdemy extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stageControls) {
        //Stage stageControls = new Stage();
        stageControls.setTitle("Hello");
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane,800,500);
        Button btn = new Button("Click Me");
        Label label = new Label("New label");
        VBox vBox = new VBox();
        VBox vBoxRadio = new VBox();
        ToggleGroup toggle = new ToggleGroup();
        RadioButton radioButton = new RadioButton("Red");
        RadioButton radioButton2 = new RadioButton("Blue");
        RadioButton radioButton3 = new RadioButton("Green");
        ComboBox comboBox = new ComboBox(); // good for large number of options
        ChoiceBox choiceBox = new ChoiceBox(); // good for small number of options
        CheckBox checkBox = new CheckBox("Subscribe to a newsletter");
        CheckBox checkBox1 = new CheckBox("Subscribe to a blog");
        HBox hboxCombo = new HBox();
        HBox hboxColor = new HBox();

        ColorPicker colorPicker = new ColorPicker();

        Slider slider = new Slider();

        TextField textField = new TextField();
        PasswordField passwordField = new PasswordField();

        gridPane.add(btn,0,0);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(label,1,0);
        label.setFont(Font.font("arial", FontWeight.BOLD, FontPosture.ITALIC,20));

        HBox hBoxChoice = new HBox();
        vBoxRadio.getChildren().add(radioButton);
        vBoxRadio.getChildren().add(radioButton2);
        vBoxRadio.getChildren().add(radioButton3);

        vBox.getChildren().addAll(checkBox,checkBox1);
        gridPane.add(vBox,5,0);

        radioButton.setToggleGroup(toggle);
        radioButton2.setToggleGroup(toggle);
        radioButton3.setToggleGroup(toggle);
        gridPane.add(vBoxRadio,0,3);
        radioButton.setSelected(true);
        checkBox.setSelected(true);
        //checkBox1.setAllowIndeterminate(true);
        gridPane.add(textField,0,6);
        gridPane.add(passwordField,0,7);
        gridPane.add(comboBox,0,8);
        comboBox.getItems().add("Option 1");
        comboBox.getItems().add("Option 2");
        comboBox.getItems().add("Option 3");
        comboBox.setValue("Option 2");
        //comboBox.setEditable(true);
        choiceBox.getItems().addAll("cb 1","cb 2", "cb3");
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(50);
        slider.setMax(100);
        slider.setMin(0);

        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        hBoxChoice.getChildren().add(choiceBox);
        hboxCombo.getChildren().add(comboBox);

        gridPane.add(hboxCombo,0,9);
        gridPane.add(hBoxChoice,0,10);

        gridPane.add(slider,0,11);
       // gridPane.setRowSpan(slider,2);

       hboxColor.getChildren().add(colorPicker);
       gridPane.add(hboxColor,0,12);

       TextArea ta = new TextArea();
       ta.setPrefRowCount(10);
       ta.setPrefColumnCount(20);

        ObservableList<String> country = FXCollections.observableArrayList("India","Japan");
       ListView<String> listView = new ListView<>(country);
       gridPane.add(listView,0,15);
       listView.setOrientation(Orientation.VERTICAL);
       listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        stageControls.setScene(scene);
        stageControls.show();
    }
}
