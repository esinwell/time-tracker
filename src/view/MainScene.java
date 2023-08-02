package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainScene {
  public static final int WIDTH = 600;
  public static final int HEIGHT = 500;

  private BorderPane root;
  private Scene scene;

  private TimerPane timerPane;


  public Scene makeScene() {
    root = new BorderPane();

    makeTimerPane();
    root.setCenter(timerPane);

    scene = new Scene(root, WIDTH, HEIGHT);
    return scene;
  }

  private void makeTimerPane() {
    timerPane = new TimerPane();
    timerPane.setAlignment(Pos.CENTER);
  }

}
