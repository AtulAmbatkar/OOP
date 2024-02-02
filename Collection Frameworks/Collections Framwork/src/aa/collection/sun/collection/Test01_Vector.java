package aa.collection.sun.collection;
import java.util.Vector;
public class Test01_Vector {

	public static void main(String[] args) {
		
		Vector<Object> v1 = new Vector<>();
		
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println(v1);
		System.out.println();
		
		v1.add("a");
		v1.add("p");
		v1.add(true);
		v1.add(5);
		v1.add(52.25);
		v1.add(75L);
		v1.add(45.32f);
		v1.add('j');
		v1.add("kk");
		v1.add(null);
		v1.add(new Sa(5,4));
		v1.add(new Sa(5,4));
		System.out.println(v1.contains(new Sa(5,4)));
//		System.out.println(v1);
//		
//		System.out.println(v1.capacity());
//		System.out.println(v1.size());
//		System.out.println(v1);
//		System.out.println();
//		
//		v1.add("a");
//		v1.add(5);
//		v1.add(new Ex(5,6));
//		
//		System.out.println(v1.capacity());
//		System.out.println(v1.size());
//		System.out.println(v1);
//		System.out.println();
//		
//		Object obj = v1.get(4);
//		System.out.println(obj);
//		System.out.println();
		
//		v1.contains("a");
//		System.out.println(v1.containsAll(v1));
		
//		for(int i =0; i<v1.size(); i++) {
//			obj = v1.get(i);
//			System.out.print(obj+" ");
//		}
	}
}
