package aa.collection.sun.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test16_ListIterator {
	
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
		al.add("a");
		al.add(12);
		al.add("b");
		al.add(46);
		al.add("c");
		al.add(79);
		
		System.out.println(al);

		ListIterator ltr = al.listIterator();
		
		while(ltr.hasNext()) {
			Object obj = (Object)ltr.next();
			if(obj instanceof String) {
				String s = (String)obj;
				ltr.set(s.toUpperCase());
			}
			else if(obj instanceof Integer i) {
				ltr.remove();
			    ltr.add(20);
			}
//			System.out.println();
		}
		System.out.println();
		System.out.println(al);
	}

}
