package aa.collection.serialziable.student;

import java.util.Map;
import java.util.HashMap;

public class A{
	
     public static void main(String [] arga) {
    	 
    	 Map <Object,Object> map = new HashMap<> ();
         
    	 map.put("laptop",10000);
    	 map.put("Mobile", 50000);
    	 map.put("mouse",4000);
    	 map.put("penDrive", 700);
    	
    	 System.out.println(map);
    	 
    	 System.out.println(map.putIfAbsent("laptop", 40000));
    	 
    	 System.out.println(map);
    	
    	 map.putAll(map);

    	 System.out.println(map);
    	 
    	 System.out.println(map.put("Mobile", 70000));
    	 
    	 System.out.println(map);
    	 
     }

}
