package view;

import javafx.scene.control.Button;

public class TimerButton extends Button {

  private static final String start = "START";
  private static final String end = "STOP";
  private boolean isTiming;

  public TimerButton() {
    isTiming = false;
    this.setAppropriateText();
    this.setOnAction(e -> {
      toggleTimer();
    });
  }


  private void toggleTimer() {
    isTiming = !isTiming;
    this.setAppropriateText();
  }

  private void setAppropriateText() {
    this.setText(isTiming ? end : start);
  }

}
