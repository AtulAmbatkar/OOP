package aa.exception.handlingfinnaly_rules;

public class Test07_InnerFinally {

	 public static void main(String[] args) {
			System.out.println(m1());
		}
		 
		 static int m1() {
			 
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
					 return 10;
				 }
				// System.out.println("after try/catch/finally");
			 }catch(NullPointerException e) {
				 System.out.println("outer catch");
			 }finally {
				 System.out.println("outer finally");
				 return 50;
			 }
		    // System.out.println("after outer try/catch/finally");
		 }
}
