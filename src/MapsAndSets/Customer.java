package MapsAndSets;

import java.util.Comparator;
import java.util.UUID;

public class Customer implements Comparator<Customer>{
	UUID id;
	String name;
	
	
	public Customer(String name) {
		this.id = UUID.randomUUID();
		this.name = name;
	}

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.id == o2.id){
			return 1;
		}
		return 0;
	}
}