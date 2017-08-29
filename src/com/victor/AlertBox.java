package com.victor;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * @author Victor I. Afolabi
 *         Artificial Intelligence & Software developer.
 *         javafolabi@gmail.com
 *         Created on 29 Aug, 2017
 *         Time: 3:08 PM
 *         Copyright © 2017. Victor I. Afolabi. All rights reserved.
 */

public class AlertBox {

  /**
   * Show the AlertBox
   *
   * @param message Message to be alerted!
   * @credits Victor I. Afolabi
   */
  public static void show(String message) {
    show("Alert", message);
  }

  /**
   * Show the AlertBox
   *
   * @param title   Title of the AlertBox
   * @param message Message to be alerted!
   * @credits Victor I. Afolabi
   */
  public static void show(String title, String message) {
    Stage window = new Stage();
    window.initModality(Modality.APPLICATION_MODAL);
    window.setTitle(title);

    Label msg = new Label(message);
    Button close = new Button("Ok");
    close.setOnAction(e -> window.close() );

    VBox layout = new VBox(10);
    layout.getChildren().addAll(msg, close);
    layout.setAlignment(Pos.CENTER);
    layout.setPadding(new Insets(20, 20, 20, 20));

    Scene scene = new Scene(layout);
    window.setScene(scene);
    window.showAndWait();
  }

}
