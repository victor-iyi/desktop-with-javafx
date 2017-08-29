package com.victor;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * @author Victor I. Afolabi
 *         Artificial Intelligence & Software developer.
 *         javafolabi@gmail.com
 *         Created on 29 Aug, 2017
 *         Time: 3:32 PM
 *         Copyright © 2017. Victor I. Afolabi. All rights reserved.
 */
public class ConfirmBox {

  static boolean answer = false;

  /**
   * Show a confirmation box
   *
   * @param message Confirmation message
   * @return answer
   * @credits Victor I. Afolabi
   */
  public static boolean show(String message) {
    return show("Confirm", message, "Ok", "Cancel");
  }

  /**
   * Show a confirmation box
   *
   * @param title   Title of the window
   * @param message Confirmation message
   * @param pos     Positive button title
   * @param neg     Negative button title
   * @return answer
   * @credits Victor I. Afolabi
   */
  public static boolean show(String title, String message, String pos, String neg) {
    Stage window = new Stage();
    window.setTitle(title);
    window.initModality(Modality.APPLICATION_MODAL);

    Label msg = new Label(message);

    Button posBtn = new Button(pos);
    Button negBtn = new Button(neg);
    posBtn.setOnAction(event -> {
      answer = true;
      window.close();
    });
    negBtn.setOnAction(event -> {
      answer = false;
      window.close();
    });

    HBox btnLayout = new HBox(15);
    btnLayout.getChildren().addAll(posBtn, negBtn);
    btnLayout.setAlignment(Pos.BASELINE_CENTER);

    VBox mainLayout = new VBox(10);
    mainLayout.getChildren().addAll(msg, btnLayout);
    mainLayout.setPadding(new Insets(20, 20, 20, 20));
    mainLayout.setAlignment(Pos.CENTER);

    Scene scene = new Scene(mainLayout);
    window.setScene(scene);
    window.showAndWait();

    return answer;
  }

}
