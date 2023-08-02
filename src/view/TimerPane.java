package view;

import javafx.scene.layout.VBox;

public class TimerPane extends VBox {
  private TimerButton myTimerButton;


  public TimerPane() {
    myTimerButton = new TimerButton();
    this.getChildren().add(myTimerButton);
  }

}
