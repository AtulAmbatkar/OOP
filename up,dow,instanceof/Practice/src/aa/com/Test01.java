package aa.com;

public class Test01 {

	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 * 
	 */
	

	public static void main(String[] args) {
		
		A a = new B() ;
		
		
		
		System.out.println(a instanceof Object);
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		
		Object obj = new B();
		
		System.out.println(obj instanceof Object);
		System.out.println(obj instanceof B);
		System.out.println(obj instanceof C);
		System.out.println(obj instanceof D);
		  System.out.println();
		  		  System.out.println();	
	}

	@Override
	public String toString() {
		return "Test01 []";
	}
}