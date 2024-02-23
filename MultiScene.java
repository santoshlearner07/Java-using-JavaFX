import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;

public class MultiScene extends Application {

    Stage window; // first step
    Scene scene1, scene2; // intialize scene

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage; // connect to stage

        Label label1 = new Label("Welcome to first scene");
        Button button1 = new Button("Go to Scene 2");
        button1.setOnAction(e -> window.setScene(scene2)); // kind of works as setstate, event, onclick as React

        // layout 1 = children are laid out in vertical column
        VBox layout1 = new VBox(20); // 20 pixels
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        // button 2
        Button button2 = new Button("Go to Scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        // layout 2
        StackPane layout2 = new StackPane();
        // Label label2 = new Label("Welcome to Second scene");
        // layout2.getChildren().addAll(label2,button2);
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene2);
        window.setTitle("Title here");
        window.show();



    }

}
