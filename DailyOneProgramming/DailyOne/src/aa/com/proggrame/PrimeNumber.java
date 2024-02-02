import java .util.Scanner;

public class PrimeNumber {
	
	public static void main(String [ ] args) {
		
                                      Scanner scn = new Scanner(System.in);
                                      System.out.print("Enter Number: ");

		int a = scn.nextInt();
		
		int b = 1;
		for(int i = 2; i<= a ; i++ ) {
			
			b  = a %i;
	
	    if(b == 0) {
	    	System.out.println("is prime Number");
	    }
                       else {
                                    System.out.println("is not prime");
	}
                }
           }

}