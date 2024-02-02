package aa.exception.handling_rules;

public class Test04InnerWOter {
	
	public static void main(String [ ] args) {
		
		   try {
			   int a = Integer.parseInt(args[0]);    
			   System.out.println("a: "+a);
			   
			   try {
				   int[] x = new int[a];
				   System.out.println("Array size: "+x.length);
			   }catch(NullPointerException e) {
				   System.out.println("nullPointer Eception is raised");
			   }
			  int b = a+20;
			  System.out.println("b: "+b);
			  
		   }catch(ArrayIndexOutOfBoundsException e) {
			   System.out.println("Pass one int value");
		   }
		   catch(NumberFormatException e) {
			   System.out.println("Pass only int value");
		   }
		 //catch(NegativeArraySizeException e) {
		//  int[] x = new int[3];
		//  System.out.println("Array size: "+ "to "+ x.length);
		// }
		   System.out.println("after outer try/catch block");
	}
}