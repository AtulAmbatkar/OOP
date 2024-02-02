package aa.collection.sun.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Test02_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
		System.out.println(al.size());
		System.out.println(al);
		System.out.println();
		
		al.add("a");
		al.add("b");
		al.add(5);
		al.add(6.7);
		al.add(null);
		al.add(new Ex(6,7));
		al.add('p');
		al.add("a");
		al.add(5);
		al.add(null);
		al.add(new Sa(11,6));
		al.add(new Sa(11,6));
		
		Iterator<Object> itr = al.iterator();
		System.out.println(itr);
		
		for(Object obj : al) {
			System.out.print(obj + " ");
		}
		
		System.out.println(al.size());
		System.out.println(al);
		System.out.println();
		
		al.add("n");
		
		System.out.println(al.contains("b"));
		
		System.out.println(al.contains(new Ex(6,7)));
		
	
		
	}
}
