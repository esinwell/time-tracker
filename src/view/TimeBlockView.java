package view;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import model.TimeBlock;

//TODO add project/color

public class TimeBlockView extends VBox {

  private TimeBlock myTimeBlock;

  private TextFlow duration;
  private static final Text H = new Text(" H ");
  private static final Text M = new Text(" M ");
  private static final Text S = new Text(" S");

  private Text start = new Text();
  private Text end = new Text();


  public TimeBlockView(TimeBlock timeBlock) {
    myTimeBlock = timeBlock;

    makeBox();

  }

  private void makeBox() {
    findDuration();
    this.getChildren().add(duration);

    start.setText(formatDate(myTimeBlock.startTime()));
    start.setStyle("-fx-font-style: italic");
    end.setText(formatDate(myTimeBlock.endTime()));
    end.setStyle("-fx-font-style: italic");
    this.getChildren().addAll(start,end);


  }

  private void findDuration() {

    Duration dur = Duration.between(myTimeBlock.startTime(), myTimeBlock.endTime());
    long seconds = dur.getSeconds();
    long min = (seconds % 3600) / 60;
    long hrs = seconds / 3600;
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

  private String formatDate(LocalDateTime time) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss dd MMM yy");
    String text = time.format(dtf);
    return text;
  }


}
