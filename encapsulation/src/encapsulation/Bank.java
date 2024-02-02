package encapsulation;

import java.util.InputMismatchException;
import java.util.Scanner;
 class BankAccount {
	private double balance;
	
	public void setBalance (double balance) 
			                       throws IllegalArgumentException {
		
		if(balance==0) 
			    throw new IllegalArgumentException ("Don't pass zero");
		
		if(balance < 0)
			    throw new IllegalArgumentException("Dont'n pass wrong value");
		
		 this.balance=balance;
			    
		}
	public double getBalance() {      
		return balance;
	}
}
 public class Bank {
	 
	 public static void main(String [ ] args) {
		 Scanner scn = new Scanner(System.in);
		 BankAccount ba = new BankAccount();
		 
		 while(true) {
			 try {
				 System.out.print("Enter balance: ");
				 double balance = scn.nextDouble();
				 ba.setBalance(balance);
				 System.out.println("Current balnace: "+ba. getBalance());
				 break;
			 }catch(InputMismatchException e) {
				 System.out.println("Enter only number");
				 scn.nextLine();
			 }catch(IllegalArgumentException e) {
				 System.out.println(e.getMessage());
			 }
		 }
		 
		 
		 }
	 }