
/*
 * This program is meant to test a basic JavaFX program with VS Code
 */

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class App extends Application{
    @Override //override the start method from the Application class
    public void start(Stage primaryStage){
        //create a scene with a button
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("Test JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //main is only needed with certain IDE's. I don't know if VS Code needs 
    //it so I'll just include it. It's always the same.
    public static void main(String[] args){
        Application.launch(args);
    }
}