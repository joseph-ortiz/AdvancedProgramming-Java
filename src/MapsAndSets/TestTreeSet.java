package MapsAndSets;
import java.util.*;

public class TestTreeSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();		
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("Beijing");
		set.add("New York");

		TreeSet<String> treeSet = new TreeSet<>(set);
		System.out.println("Sorted tree set: " + treeSet);

		//Use the methods in the Sorted Set interface
		System.out.println("first(): " + treeSet.first());
		System.out.println("last(): " + treeSet.last());
		System.out.println("headSet(\"New York\"): " + treeSet.headSet("New York"));
		System.out.println("tailSet(\"New York\"): " + treeSet.tailSet("New York"));
		
	}
}
