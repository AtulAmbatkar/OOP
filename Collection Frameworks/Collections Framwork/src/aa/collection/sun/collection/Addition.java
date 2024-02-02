package aa.collection.sun.collection;

@FunctionalInterface
public interface Addition {
	
	void calculate(int a,int b);
	
//	void add(float a, float b);
	
	default void calculate(float c, float d) {
		System.out.println("floatfunction interface: " + (c+d));
	}
	
	default void calculate(double a, double b) {
		System.out.println("Double function interface: " + (a+b));
	}
	
	static void calcukate(String a , String b) {
		System.out.println("String  function interface: " + (a+b));
	}

}