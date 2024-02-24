package alertBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Mainn extends Application{
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("Alert Box Calling");
       Button button = new Button();
        button.setOnAction(null);
        StackPane layout  = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,400);
        window.setScene(scene);
        window.show();
    }
}