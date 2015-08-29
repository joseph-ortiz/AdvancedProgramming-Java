package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontDemo extends Application{
	@Override
	public void start(Stage primaryStage) {
		//Create a pane to hold the circle.
		Pane pane = new StackPane();
		
		//Create a circle and set its properties
		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(new Color(0.5,0.5,0.5,0.1));
		pane.getChildren().add(circle);
		
		//Create a label and set its properties
		Label lable = new Label("JavaFX");
		lable.setFont(Font.font("Helvetica",
				FontWeight.BOLD,
				FontPosture.ITALIC,
				20));
		pane.getChildren().add(lable);
		
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Font Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
