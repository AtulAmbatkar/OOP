package aa.collection.sun.collection;

import java.util.TreeSet;

public class CheckTreeset {

	public static void main(String[] args) {
		
		TreeSet<A> ts = new TreeSet<> ();
		
		ts.add(new A(5));
		ts.add(new A(5));
		
		System.out.println(ts);
		
		
	}
}
