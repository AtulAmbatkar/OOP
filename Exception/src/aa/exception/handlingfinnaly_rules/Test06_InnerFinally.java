package aa.exception.handlingfinnaly_rules;

public class Test06_InnerFinally {

	 public static void main(String[] args) {
		m1();
	}
	 
	 static void m1() {
		 
		 System.out.println("outer before try/catch/finally");
		 
		 try {
			 System.out.println("outer try ");
			 
			 try {
				 System.out.println("inner try");
				 System.out.println(10/0);
			 }//catch(ArithmeticException e) {
			   catch(NullPointerException e) {
				 System.out.println("inner catch");
			 }finally {
				 System.out.println("inner finally");
			 }
			 System.out.println("after inner try/catch/finally");
		 }catch(NullPointerException e) {
			 System.out.println("outer catch");
		 }finally {
			 System.out.println("outer finally");
		 }
	     System.out.println("after outer try/catch/finally");
	 }
}
