package aa.collection.Arrray;

public class NiTcollectionTest {
	
	public static void main(String[] args) {
		
		NiTCollection col = new NiTCollection();
		
		System.out.println(col.capacity());
		System.out.println(col.size());
		System.out.println(col);
		System.out.println();
		
		col.add("a");
		col.add("atul");
		col.add(new Student(5,6));
		col.add(50.2);
		col.add(true);
     	col.add (new Person());
		col.add (new Tiger());
		col.add ("hari");
		
        System.out.println(col.capacity());
        System.out.println(col.size());
        System.out.println(col);
        System.out.println();
        
        col.add("dada");
        col.add("jaja");
        col.add("dada");
        col.add("rudi");
        System.out.println(col);
        System.out.println(col.capacity());
        System.out.println(col.size());
		
		boolean result = col.contains("a");
		System.out.println(result);
		
		System.out.println(col.contains("atul"));
		
//		System.out.println(col.("atul"));
		System.out.println(col.contains("hari"));
		
		System.out.println(col.contains("baba"));
	
	}

}
