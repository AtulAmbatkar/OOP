package aa.exception.handlingfinnaly_rules;

public class Test02 {

	 public static void main(String[] args) {
		
		 System.out.println("before try/catch/finally ");
		 
		 try {
			 System.out.println("in try ");
			 System.out.println(10/0);
		 }
		 finally {
			 System.out.println("in finally");
		 }
		 System.out.println("after try/finall");
	}
}