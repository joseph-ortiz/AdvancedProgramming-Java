package JavaFX;

import java.awt.Color;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class ClockPane extends Pane {
	private int hour;
	private int minute;
	private int second;
	
	//Clock pane's width and height
	private double w = 250, h = 250;
	
	/**Construct a default clock with the current time**/
	public ClockPane(){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		paintClock();
	}

	private void paintClock() {
		//Initialize clock parameters
		double clockRadius = Math.min(w, h) * 0.8 * 0.5;
		double centerX = w /2;
		double centerY = h /2;
		Circle circle = new Circle(centerX, centerY, clockRadius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
		Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
		Text t3 = new Text(centerX + clockRadius - 10, centerY  + 3, "3");
		Text t4 = new Text(centerX - 3 , centerY + clockRadius - 3, "6");
		
		//Draw a second hand
		double sLength
	}
	
	
	
	
	
	
}
public class DisplayClock extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage){
		ClockPane clock = new ClockPlane();
		String timeString = clock.getHour();
		
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300,200);
		primaryStage.setTitle("ShowArc");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
