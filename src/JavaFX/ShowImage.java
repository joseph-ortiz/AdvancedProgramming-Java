package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowImage extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5,5,5,5));
		Image image = new Image("https://octodex.github.com/images/topguntocat.png");
		
		pane.getChildren().add(new ImageView(image));
		
		ImageView imageView2 = new ImageView(image);
		imageView2.setFitHeight(200);
		imageView2.setFitWidth(200);
		imageView2.setVisible(true);
		pane.getChildren().add(imageView2);
		
		ImageView imageView3 = new ImageView(image);
		imageView3.setRotate(90);
		imageView3.setVisible(true);
		pane.getChildren().add(imageView3);
//		
		//Create a scene and place it in the stage.
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowImage");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

}
