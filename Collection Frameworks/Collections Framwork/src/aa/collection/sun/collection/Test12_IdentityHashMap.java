package aa.collection.sun.collection;

import java.util.IdentityHashMap;
import java.util.Map;

public class Test12_IdentityHashMap {
	public static void main(String[] args) {
		Map<Integer, String> identity_hash 
        = new IdentityHashMap<Integer, String>(); 

    // Mapping string values to int keys 
    // using put() method 
    identity_hash.put(10, "Geeks"); 
    identity_hash.put(15, "4"); 
    identity_hash.put(20, "Geeks"); 
    identity_hash.put(25, "Welcomes"); 
    identity_hash.put(30, "You"); 

    // Displaying the IdentityHashMap 
    System.out.println("Initial Mappings are: "
                       + identity_hash); 

    // Inserting existing key along with new value 
      // previous value gets returned and stored in 
      // returned_value 
    String returned_value 
        = (String)identity_hash.put(20, "All"); 

    // Verifying the returned value 
    System.out.println("Returned value is: "
                       + returned_value); 
	
	  System.out.println("Initial Mappings are: " + identity_hash); 
	}

}
