package aa.exceptionhandlinh_calling_propogetion;

public class Test01TryCatch{
	
	public static void main(String[] args) {
		System.out.println( "main start");
		m1();
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