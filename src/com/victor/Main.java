package com.victor;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

  private Stage window;

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
    window = primaryStage;
    window.setTitle("JavaFX GUI");

    CheckBox male = new CheckBox("Male");
    CheckBox female = new CheckBox("Female");
    male.setSelected(true);

    HBox gender = new HBox(15);
    gender.getChildren().addAll(male, female);

    Button button = new Button("Click me");
    button.setOnAction(event -> handleOptions(male, female));

    VBox layout = new VBox(10);
    layout.getChildren().addAll(gender, button);
    layout.setPadding(new Insets(15, 15, 15, 15));

    Scene scene = new Scene(layout, 300, 250);
    window.setScene(scene);
    window.show();
  }

  /**
   * Close the window properly
   */
/*  public void close() {
    boolean answer = ConfirmBox.show("Are you sure you want to close this window?");
    if (answer)
      window.close();
  } */
  private void handleOptions(CheckBox...boxes) {
    System.out.println();
    for(CheckBox box : boxes) {
      if ( box.isSelected() )
        System.out.println("You are a " + box.getText());
    }
  }

}
