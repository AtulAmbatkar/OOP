package aa.collection.sun.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class Test15_CursorObjectIterator {
	
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
		al.add("a");
		al.add("b");
		al.add("j");
		System.out.println(al);
		
		al.addFirst("c");
		al.addLast("d");
		
		int value= al.indexOf("j");
		
		System.out.println(al.get(value));
		System.out.println(value);
		
		System.out.println(al);
		
		java.util.Iterator<Object> itr = al.iterator();
		
		LinkedHashSet<Object> hs = new LinkedHashSet<>();
		
		hs.add(97);
		hs.add("a");
		hs.add(56);
		hs.add("p");
		hs.add(889);
		hs.add("d");
		hs.add(112);
		
		Iterator<Object> itr1 = hs.iterator();
		
		while(itr1.hasNext()) {
			Object obj = (Object)itr1.next();
			if(obj instanceof String s) {
				itr1.remove();
				
			}
			System.out.println(obj+" ");
		}	
		
		System.out.println("\n"+hs);
	}

}
