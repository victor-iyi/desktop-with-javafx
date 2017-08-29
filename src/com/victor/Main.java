package com.victor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
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
    window.setOnCloseRequest(event -> {
      event.consume();
      close();
    });

    Button button = new Button("Click me");
    button.setOnAction(e -> {
      boolean answer = ConfirmBox.show("Are you sure you wanna send naked pics?");
      if (answer)
        AlertBox.show("Shit! She's gonna send her naked pics");
    });

    StackPane layout = new StackPane();
    layout.getChildren().add(button);

    Scene scene = new Scene(layout, 300, 250);
    window.setScene(scene);
    window.show();
  }

  /**
   * Close the window properly
   */
  public void close() {
    boolean answer = ConfirmBox.show("Are you sure you want to close this window?");
    if ( answer )
      window.close();
  }

}
