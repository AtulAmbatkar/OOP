package aa.collection.sun.collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Tesr11_WeakHashMap {

	public static void main(String[] args) {
		
		WeakHashMap<Object,Object> whm = new WeakHashMap<>();
		
//		HashMap<Object,Object> whm = new HashMap<>();
		
		Ex e1 = new Ex(3,4);
		Ex e2 = new Ex(5,6);
		
		whm.put(e1,1);
		whm.put(e2, 2);
		
		whm.put(new Ex(6,7), 3);
		
		whm.put(new Ex(8,9), 3);
		
		System.out.println(whm);
		System.gc();
		System.out.println(whm);
	}
}
