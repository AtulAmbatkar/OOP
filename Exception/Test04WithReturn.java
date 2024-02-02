public class Test04WithReturn {

	  public static void main(String[] args) {
		
		  System.out.println("in main");
		  m1();
		  System.out.println("end main");
	}
	  
	  static void m1() {
		  
		  System.out.println("before block");
		  try {
			  System.out.println("in try");
			 // return;
		  }catch(ArithmeticException e) {
			  System.out.println("in catch");	
		  }
		  finally {
			  System.out.println("in finally");
			  return;
		  }
		//  System.out.println("after try/catch/finally");
	  }
}