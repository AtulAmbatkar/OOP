package aa.abstraction.allfield;

public interface i1 {
 
	int x =10;
	
	void add();
	
	public static void main(String[] args) {
		System.out.println(x);
		addition();
		
	}
	
	public default void subtract() {
		int x = 10;
		int y = 50;
		System.out.println("i1: "+(y-x));
	}
	
	public static void addition() {
		System.out.println("hi dada ");
	}
}
