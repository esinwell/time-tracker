import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.MainScene;

public class TimeTrackerMain extends Application {

  private MainScene myMainScene;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    myMainScene = new MainScene();
    Scene scene = myMainScene.makeScene();
    primaryStage.setScene(scene);
    primaryStage.show();



  }
}
