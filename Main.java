import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

    Button button;
    Button button2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Title of Window");

        button = new Button();
        button2 = new Button();
        button.setText("Button Name");
        button2.setText("Button Name 2 ");
        button.setOnAction(e->{
            System.out.println("Hey SetOnAction");
            System.out.println("Hello world");
        });
    

        StackPane layout = new StackPane();

        layout.getChildren().add(button);
        layout.getChildren().add(button2);


        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);


        primaryStage.show();

    }
}