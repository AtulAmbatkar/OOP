package aa.exception.handling_rules;



import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStream;
import java.io.InputStreamReader;

public class FinalTryWithCatch {
	
	static void division() {
		
		try { 
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  
		    int a ;
		    int b ;
		 
		   while(true) {
			try {
			System.out.print("Enter first Number: ");
			 a = Integer.parseInt(br.readLine());
			 break;

			}catch (NumberFormatException npr) {
			System.out.println("please pass Int value only");
			}
	   }
	   
		while(true) { 
			try {
		         System.out.print("Enter second number: ");
			     b = Integer.parseInt(br.readLine());
				
				try {
					int c = a/b ;
					System.out.println("Result: "+c);
				}catch(ArithmeticException e) {
					System.out.println("does not enter second value as zero: ");
					continue;
				}
			  break;
			}catch(NumberFormatException e) {
				System.out.println("enter onle integer value");
			} 
        }
      } catch(IOException ioe) {
           ioe.printStackTrace();
         }
 }
  
   public static void main(String [ ] args) {
	   division();
   }
}
