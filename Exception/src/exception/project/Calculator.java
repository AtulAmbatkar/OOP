package exception.project;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("\nEnter Fno: ");
				int a = scn.nextInt();
				
				System.out.print("Enter Sno: ");
				int b = scn.nextInt();
				
				int result = Addition.add(a, b);
				System.out.println("Reult: " + result);
				break;
			}catch(InputMismatchException e) {
				System.out.println("Please pass only integer number");
				scn.nextLine();
			}catch(NegativeNumberException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}