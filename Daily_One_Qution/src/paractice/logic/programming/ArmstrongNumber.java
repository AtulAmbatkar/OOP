package paractice.logic.programming;

import java.util.Scanner;
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter you wanat check the number is armestrong or not: ");
		int sumOfcube = 0,a,temp;
		
		// int number = 153;
		int number = scn.nextInt();
		temp=number;
		
		while(number>0) {
			
			a = number % 10 ;      // for last digit remainder
			
			number = number/10;   //  divison for last number cutting bucause
			                      //  of int(data) value dicimal not considerd
			
			sumOfcube = sumOfcube + (a*a*a);	// sum + (cub given last number);	
		}
		
		if(sumOfcube == temp) {
		
			System.out.println(temp+":is armestrong number");	
		}else {
			System.out.println(temp+" :is not armstrong number");
		}
		
	}
}