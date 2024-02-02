package aa.collection.Arrray;

public class NiTTableTest {

	public static void main(String[] args) {
		
    	NiTTable table = new NiTTable();
    	
    	System.out.println("Capacity: "+table.capacity());
    	System.out.println("size: "+table.size());
    	System.out.println("table: "+table);
    	System.out.println();
    	
    	table.put(1, "atul");
    	table.put(2, "rushi");
    	table.put(3, "papa");
    	table.put(4, "mami");
    	table.put(5, "aaji");
    	
    	System.out.println("Capacity: "+table.capacity());
    	System.out.println("size: "+table.size());
    	System.out.println("table: "+table);
    	System.out.println();
    	
    	table.put(45.64, "Atul");
    	table.put(94L, "Atul");
//    	table.put(new Person(), new Student());
    	
    	System.out.println("Capacity: "+table.capacity());
    	System.out.println("size: "+table.size());
    	System.out.println("table: "+table);
    
	}
}
