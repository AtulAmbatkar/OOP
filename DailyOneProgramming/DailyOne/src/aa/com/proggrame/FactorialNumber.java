package aa.com.proggrame;
import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number you wnant give this number as factorial : ");
		
		int number = scn.nextInt();
		
		// int number = 10;
		
		   int fact =1;
		   
	    // int i = 1;
		
		
	   for(int i = 1; i<=number ; i++) {
			
			fact = fact*i;
			
		}
		System.out.println(fact);
	}

}