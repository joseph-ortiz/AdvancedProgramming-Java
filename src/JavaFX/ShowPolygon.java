package JavaFX;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class ShowPolygon extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		
		Polygon polygon = new Polygon();
		pane.getChildren().add(polygon);
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> list = polygon.getPoints();
		
		final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH / 2, centerY = HEIGHT/2;
		double radius = Math.min(WIDTH,  HEIGHT) * 0.4;
		
		for( int i = 0; i < 6; i++)
		{
			list.add(centerX + radius * Math.cos(2 * i * Math.PI /6));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
		}
		
		
		
		//Add points to the Polygon List;
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane, WIDTH,HEIGHT);
		primaryStage.setTitle("ShowPolygon");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
