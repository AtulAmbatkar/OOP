package aa.exception.handlingfinnaly_rules;

public class Test01 {
	public static void main(String [] args) {
		
		System.out.println("Before try block");
		
		try {
			System.out.println("in try");
			System.out.println("in try block" + 10/0);
		}catch(ArithmeticException e) {
		  //  catch(NullPointerException e) {
			System.out.println("in catch block");
		} 
		finally{
			System.out.println("in finally");
		}
		System.out.println("after try/catch/finlly block");
	}

}
