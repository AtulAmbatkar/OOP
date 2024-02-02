

public class Test03WithReturn {
	
	public static void main(String[] args) {
		
		System.out.println(m1());
	}
	
	static int m1() {
		
		System.out.println("before try/catch/finally");
		
		try {
			System.out.println("in try");
			// System.out.println(10/0);
			return 10;
		}catch(ArithmeticException e) {
		// catch(NullPointerException r) {
			System.out.println("in catch");
			return 20;
		}finally {
			System.out.println("in finally");
			// return 30;
		}
		System.out.println("after finally");
	}

}
