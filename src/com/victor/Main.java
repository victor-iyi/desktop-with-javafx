package com.victor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

  public static void main(String[] args) {
    launch(args);
  }


  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("JavaFX GUI");

    Button button = new Button("Click me");
    button.setOnAction(e -> {
      System.out.println("Hello, there");
      System.out.println("Hello, lambda smooth!");
    });

    StackPane layout = new StackPane();
    layout.getChildren().add(button);

    Scene scene = new Scene(layout, 300, 250);
    primaryStage.setScene(scene);
    primaryStage.show();
  }


}
