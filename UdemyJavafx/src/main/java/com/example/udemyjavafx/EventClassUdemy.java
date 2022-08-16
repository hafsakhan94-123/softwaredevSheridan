package com.example.udemyjavafx;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class EventClassUdemy {
    public static void onButtonClick(){
        Stage stageEvent = new Stage();
        Scene sceneClick = new Scene(new Label("BHAINDCHOD!@!!!!!"),200,200);
        stageEvent.setScene(sceneClick);

        stageEvent.show();
    }
    public static void onButtonBye(){
        Stage stageBye = new Stage();
        Scene sceneBye = new Scene(new Label("Bye Button pressed"),200,200);
        stageBye.setScene(sceneBye);
        stageBye.show();
    }
}
