package aa.exception.handling_rules;

public class Test02 {
	
	static void m1() {
		System.out.println(10/0);
		try {
			System.out.println("2");
			System.out.println(10/0);
			System.out.println("4");
		}// catch(ArrayIndexOutOfBoundsException e) {
		//  catch(Exception e) {
		    catch(ArithmeticException e) {
			System.out.println("5");
			System.out.println(10/0);
			System.out.println("7");
		} System.out.println("8");
	}
	public static void main(String [] args) {
		
		System.out.println("main start");
		m1();
		System.out.println("min end");		
	}

}