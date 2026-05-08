package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Norte");
        Button button2 = new Button("Sur");
        Button button3 = new Button("Este");
        Button button4 = new Button("Oeste");
        Button button5 = new Button("Centro");

        BorderPane root = new BorderPane();
        root.setTop(button1);
        root.setBottom(button2);
        root.setLeft(button3);
        root.setRight(button4);
        root.setCenter(button5);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Border Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
