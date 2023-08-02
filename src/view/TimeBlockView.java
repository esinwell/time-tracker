package view;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import model.TimeBlock;

public class TimeBlockView extends VBox {

  private TimeBlock myTimeBlock;

  private TextFlow duration;
  private static final Text H = new Text("H");
  private static final Text M = new Text("M");
  private static final Text S = new Text("S");




  public TimeBlockView(TimeBlock timeBlock) {
    myTimeBlock = timeBlock;

  }

  private void makeBox() {
    findDuration();
    this.getChildren().add(duration);

  }

  private void findDuration() {
    long milis = myTimeBlock.calculateTime();
    int seconds = (int) milis / 1000;
    int min = (seconds % 3600) / 60;
    int hrs = seconds / 3600;
    seconds = (seconds % 3600) % 60;

    Text myH = new Text(String.valueOf(hrs));
    myH.setStyle("-fx-font-weight: bold");
    Text myM = new Text(String.valueOf(min));
    myM.setStyle("-fx-font-weight: bold");
    Text myS = new Text(String.valueOf(seconds));
    myS.setStyle("-fx-font-weight: bold");

    duration = new TextFlow();
    duration.getChildren().addAll(myH, H, myM, M, myS, S);
  }



}
