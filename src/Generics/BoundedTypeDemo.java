package Generics;



import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class BoundedTypeDemo {

	public static void main(String[] args) {
		//Rectangle rectangle - new Rectangle(2,2); //TODO: rectangle comes from CH. 13
		Circle circle = new Circle(2);
		
		//System.out.println("Same area? " + equalArea(rectangle,circle));

	}
	
	//public static <E extends GeometricObject> boolean equalArea(E object1, E object2){
	//	return object1.getArea() == object2.getArea();
	//}

}
