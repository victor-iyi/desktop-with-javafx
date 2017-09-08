package com.victor;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

  /**
   * Entry point for the application.
   *
   * @param args other command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }


  /**
   * The main entry point for all JavaFX applications.
   * The start method is called after the init method has returned,
   * and after the system is ready for the application to begin running.
   * <p>
   * <p>
   * NOTE: This method is called on the JavaFX Application Thread.
   * </p>
   *
   * @param primaryStage the primary stage for this application, onto which
   *                     the application scene can be set. The primary stage will be embedded in
   *                     the browser if the application was launched as an applet.
   *                     Applications may create other stages, if needed, but they will not be
   *                     primary stages and will not be embedded in the browser.
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("JavaFX GUI");

    ChoiceBox<String> gender = new ChoiceBox<>();
    gender.getItems().addAll("Male", "Female");
    gender.setValue("Male");
    gender.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
      System.out.println(observable.getValue());
    });

    Button button = new Button("Click me");

    VBox layout = new VBox(10);
    layout.getChildren().addAll(gender, button);
    layout.setPadding(new Insets(15, 15, 15, 15));

    Scene scene = new Scene(layout, 300, 250);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

}
