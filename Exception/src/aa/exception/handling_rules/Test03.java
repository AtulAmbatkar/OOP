package aa.exception.handling_rules;

public class Test03 {
	public static void main(String [] args) {
		
		try {
			System.out.println("In outer try bock");
			try {
				System.out.println("inner try block");
				System.out.println(10/0);
			}catch(ArithmeticException e)
			{
				System.out.println("inner catch block");
			 }
			System.out.println("after inner try/catch block");
		} catch(ArithmeticException e) {
			System.out.println("Outter catch block");
		}
		System.out.println("after outer  try/catch block");
		
	}

}
