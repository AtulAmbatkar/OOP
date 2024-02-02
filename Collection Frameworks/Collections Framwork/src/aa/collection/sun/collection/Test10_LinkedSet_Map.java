package aa.collection.sun.collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Test10_LinkedSet_Map{
	
	public static void main(String[] args) {
		
	HashMap <Object,Object> hm = new HashMap<>();
		
		hm.put("a", 1);
		hm.put("a", 2);
		System.out.println(hm);
		
		hm.put(new String("a"),3);
		System.out.println(hm);
		
		hm.put(null, 4);
		System.out.println(hm);
		
		hm.put(null, 5);
		hm.put(null, null);
		hm.put("f", null);
		
		System.out.println(hm);
		
//	.	
		LinkedHashMap <Object,Object> lhm = new LinkedHashMap<>();
		
		lhm.put(null, null);
		System.out.println(lhm);
		
		lhm.put("df", null);
		lhm.put("f", 2);
		lhm.put("a",null);
		lhm.put(null, 45);
		
		System.out.println(lhm);
		
	}

}
