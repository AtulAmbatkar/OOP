package aa.collection.sun.collection;

import java.util.LinkedList;

public class Test03_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<Object> ll = new LinkedList<>();
		
		ll.add("a");
		ll.add(5);
		ll.add(6.7);
		ll.add(null);
		ll.add('p');
		ll.add(true);
		ll.add(new Ex(9,8));
		ll.add("a");
		ll.add(5);
		
		System.out.println(ll.size());
		System.out.println(ll);
		System.out.println();
		
		System.out.println(ll.get(2));
		
		for(int i=0; i<ll.size(); i++) {
			System.out.print(ll.get(i)+" ");
		}

		System.out.println("\n"+ll.containsAll(ll));
	}
}
