package MapsAndSets;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	
	
	public static void main(String[] args) {
		Set<Customer> set = new HashSet<Customer>();
		Customer joe = new Customer("Joe");
		Customer jim = new Customer("Jim");
		
		set.add(joe);
		set.add(jim);
		set.add(joe);
		
		for(Customer c : set){
			System.out.println(c.name);
		}
	}
}





