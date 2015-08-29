package JavaFX;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class BindingDemo  {
	
	public static void main(String[] args) {
		DoubleProperty d1 = new SimpleDoubleProperty(1);
		DoubleProperty d2 = new SimpleDoubleProperty(2);
		d1.bind(d2);
		
		
	}
}