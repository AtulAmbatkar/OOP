package aa.exceptionhandlinh_calling_propogetion;

public class Test02TryCatch {

	public static void main(String[] args) {
		System.out.println( "main start");
		try {
		    m1();
		}catch(ArithmeticException e) {
			System.out.println("in main catch");
		}
		System.out.println("main end");
	}
	
	static void m1() {
		try {
		System.out.println("in m1 method start");
		System.out.println(10/0);
		System.out.println("in m1 method end");
		
	}// catch(ArithmeticException e) {
		catch(NullPointerException e) {
		System.out.println("in m1 catch");
	 }
	}
}
