package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ShowEllipse extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		
		for(int i = 0; i < 16; i++)
		{
			Ellipse el = new Ellipse(150,100,100,50);
			el.setStroke(Color.color(Math.random(), Math.random(),Math.random()));
			el.setFill(Color.WHITE);
			el.setRotate(i * 180 /16);
			pane.getChildren().add(el);
		}
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300,200);
		primaryStage.setTitle("ShowEllipse");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
