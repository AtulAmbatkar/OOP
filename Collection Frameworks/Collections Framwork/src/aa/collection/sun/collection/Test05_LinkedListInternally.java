package aa.collection.sun.collection;

import java.util.LinkedList;
public class Test05_LinkedListInternally {
	public static void main(String[] args) {
		
		LinkedList<Object> ll = new LinkedList<>();
		
		ll.add("a");
		ll.add("b");
		ll.add(5);
		ll.add(6.7);
		ll.add('p');
		ll.add(true);
		ll.add(null);
		ll.add(new Ex(5,6));
		ll.add(new Sa(5,6));
		
		System.out.println(ll.size());
		System.out.println(ll);
		
		System.out.println(ll.contains("a"));
		System.out.println(ll);
		
		System.out.println(ll.remove("b"));
		System.out.println(ll);
		
		System.out.println(ll.indexOf(5));
		System.out.println(ll.indexOf(new Sa(5,6)));
		
		System.out.println(ll.get(7));
		
		System.out.println(ll.remove("a"));
//		System.out.println(ll.remove(5));
		System.out.println(ll);
		
		System.out.println(ll.indexOf(new Sa(5,6)));
		System.out.println(ll.remove(new Ex(5,6))); //LSA
		System.out.println(ll.get(6));  
		System.out.println(ll);
		
		
		ll.add(5,"x");
		System.out.println(ll);
		
		ll.set(1, "y");
		System.out.println(ll);
		
		
	}
}