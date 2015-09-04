package EventHandlers;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application {
	private int counter;
	public TextField simpleDisplay;

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("OK");
		Button btCancel = new Button("Cancel");
		
		
		
		 simpleDisplay = new TextField("Start with " + counter + ", and add 1 after each click");
		
		
		//Create handler for ok button
		//OKHandlerClass handler1 = new OKHandlerClass();
		btOK.setOnAction((e) -> {
				counter+=1;
				System.out.println("added +1 to the counter. " +"The counter is at " + counter);
				simpleDisplay.setText(counter + "");
		});
		
		//Create handler for cancel button
		btCancel.setOnAction(e -> {
			System.out.println("Cancel button clicked");
		});
		
		//add all the controls to the pane.
		pane.getChildren().addAll(btOK, simpleDisplay, btCancel);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("HandleEvent"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/**
	* The main method is only needed for the IDE with limited
	* JavaFX support. Not needed for running from the command line.
	*/
	public static void main(String[] args) {
		launch(args);
	}	
}
