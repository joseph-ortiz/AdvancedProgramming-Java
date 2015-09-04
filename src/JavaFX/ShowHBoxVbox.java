package JavaFX;

import java.util.Arrays;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowHBoxVbox extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane pane = new BorderPane();
		pane.setTop(getHBox());
		pane.setLeft(getVBox());
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowHBoxBbox");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	private Node getVBox() {
		VBox hBox = new VBox(15);
		hBox.setPadding(new Insets(15,15,15,15));
		hBox.setStyle("-fx-background-color: gold");
		hBox.getChildren().add(new Button("Computer Science"));
		hBox.getChildren().add(new Button("Chemistry"));
		Image img = new Image("https://octodex.github.com/images/topguntocat.png");

		ImageView imageView  = new ImageView(img);
		
		hBox.getChildren().add(imageView);
		return hBox;
	}

	private Node getHBox() {
		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15,5,5,5));
		vBox.getChildren().add(new Label("Courses"));
		Label[] courses ={ new Label("CSCI 1301"),
				new Label("CSCI 1302"),
				new Label("CSCI 2410"),
				new Label("CSCI 3720")
		};
		Arrays.stream(courses)
			  .forEach(c -> {
				  VBox.setMargin(c, new Insets(0,0,0,15));
				  vBox.getChildren().add(c);
			  });
		
		return vBox;
	}
	

}
