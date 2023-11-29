package cdpfx;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

  private Parent createContent() {
    Rectangle box = new Rectangle(100, 50, Color.BLUE);

    transform(box);

    return new Pane(box);
  }

  private void transform(Rectangle box) {
    box.setTranslateX(100);
    box.setTranslateY(200);

    box.setScaleX(1.5);
    box.setScaleY(1.5);
    box.setRotate(30);
  }

  @Override
  public void start(Stage stage) throws Exception {
    stage.setScene(new Scene(createContent(), 300, 300));
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}