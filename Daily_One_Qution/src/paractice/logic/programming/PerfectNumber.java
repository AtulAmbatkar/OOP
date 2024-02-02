package paractice.logic.programming;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = scn.nextInt();
		int sum = 0;
		// int i = 1;
		
		
		//while(true) {
			
			for (int i=1;i<number;i++) {
			if(number % i == 0) 
			    sum = sum + i;
			     // i++;
			}
		
	   if(sum == number) {
		System.out.println("Number."+number+ ":is perfect");
	}else {
		System.out.println("Number."+number+ ":is not perfect");
	} 
 }
}

