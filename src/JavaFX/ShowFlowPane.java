package JavaFX;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
			FlowPane pane = new FlowPane();
			pane.setPadding(new Insets(11,12,13,14));
			pane.setHgap(5);
			pane.setVgap(5);
			
			//Place nodes in the pane
			pane.getChildren().addAll(new Label("First name: "),
					new TextField(),
					new Label("MI: "));
			TextField tfMi = new TextField();
			tfMi.setPrefColumnCount(2);
			pane.getChildren().addAll(tfMi, 
					new Label("Last Name: "),
					new TextField());
			
			//Create a scene and place it in the stage
			Scene scene = new Scene(pane, 200,250);
			primaryStage.setTitle("ShowFlowPane");
			primaryStage.setScene(scene);
			primaryStage.show();
			
	}
	
	public static void main(String[] args){
		launch(args);
	}

}
