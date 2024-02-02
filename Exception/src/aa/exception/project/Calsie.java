package aa.exception.project;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Calsie {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		 int a;
		 while(true) {
		 try {
			while(true) {
				try {
			          System.out.print("Enter Fno: ");
			           a = scn.nextInt();
			           break;
				}catch(InputMismatchException e) {
					 System.out.println("Only pass integer");
					 scn.nextLine();
				}
			}//while close
			
			while(true) {
				try{
			        System.out.print("Enter Sno: ");
			         int b = scn.nextInt();
		
			         int result = Addition.add(a, b);
			          System.out.println("Result of two input number: "+ result);
			          break;
		        }catch(InputMismatchException e) {
			           System.out.println("only pass integer ");
			           scn.nextLine();
		        }
			}// while close
		 }catch(IllegalArgumentException e) {
			 System.out.println(e.getMessage());
		 }
		 }
	}
		
	}
