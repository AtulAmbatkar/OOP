package aa.abstraction.allfield;

public interface i2 {
   
	int x =20;
	void add();
	
	public default void subtract() {
		int x = 10;
		int y = 20;
		System.out.println("i2: "+(y-x));
	}
	
	public static void addition() {
		System.out.println("hi dada ");
	}
}
