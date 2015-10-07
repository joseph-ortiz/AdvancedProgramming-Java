package JavaFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class ButtonInPane extends Application {
	@Override 
	public void start(Stage primaryStage){
		StackPane pane = new StackPane();
		Button b = new Button("OK");
		b.setOnAction(e -> {
			System.out.println("Sleeping Thread for 1 second");
			try {
				Thread.sleep(1000);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		});
		pane.getChildren().add(b);
		Scene scene = new Scene(pane, 200, 50);
		primaryStage.setTitle("Button in Pane");;
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
}