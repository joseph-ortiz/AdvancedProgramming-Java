package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;

import javafx.scene.control.Label;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane pane = new BorderPane();
		pane.setTop(new CustomPane("TOP"));
		pane.setRight(new CustomPane("RIGHT"));
		pane.setLeft(new CustomPane("LEFT"));
		pane.setBottom(new CustomPane("BOTTOM"));
		
		//Place nodes in the pane
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowGridPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	

}
class CustomPane extends StackPane{
	public CustomPane(String title)
	{
		getChildren().add(new Label(title));
		setStyle("-fx-border-color:red");
		setPadding(new Insets(11.5));
	}
}