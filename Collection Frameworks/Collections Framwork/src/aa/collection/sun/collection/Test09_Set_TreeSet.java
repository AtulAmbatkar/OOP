package aa.collection.sun.collection;
import java.util.TreeSet;

public class Test09_Set_TreeSet{
	public static void main(String[] args) {
		
		TreeSet<Object> ts = new TreeSet<>();
		
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("y");
		ts.add("p");
		ts.add("a");
		
		System.out.println(ts.add("q"));
		System.out.println(ts.add("y"));
		
		
//		ts.add(5);		RE classCastException
//		ts.add('p');    RE
//		ts.add(null);    RE nullPointerException
		
		System.out.println(ts);
		System.out.println();
		
		TreeSet<Sa> ts1 = new TreeSet<>();
		
		ts1.add(new Sa(5,3));
		ts1.add(new Sa(4,4));
//		ts1.add(new Sa(4,7));
		ts1.add(new Sa(6,2));		
		ts1.add(new Sa(3,5));		
		
//		System.out.println(ts1);
		
        TreeSet ts2 = new TreeSet ();
        Sa s1 = new Sa(5,3);
        Sa s2 = new Sa(4,4);
        Sa s3 = new Sa(6,2);
        Sa s4 = new Sa(3,5);
        Sa s5 = new Sa(2,1);
        
        ts2.add(s1);
        ts2.add(s2);
        ts2.add(s3);
        ts2.add(s4);
        ts2.add(s5);
		
//        System.out.println(s2.compareTo(s1));
//        System.out.println(s3.compareTo(s1));
		System.out.println("ts2: " + ts2);
	}
}
