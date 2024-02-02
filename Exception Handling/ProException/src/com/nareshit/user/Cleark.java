package com.nareshit.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import com.nareshit.exceptions.*;
import com.nareshit.logic.*;


public class Cleark {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Bank acc1 = new HDFCBank();
			String option = "";
			do {
				System.out.println("1.diposite");
				System.out.println("2.withdarw");
				System.out.println("3.balance enquiry");
				
				System.out.print("Enter option: ");
				option = br.readLine();
				
				switch(option)
				{
				case "1":
				{
					System.out.print("Enter diposite amount: ");
				     String s = br.readLine();
				     double amt = Double.parseDouble(s);
				
				     acc1.deposite(amt); 
				     acc1.balanceEnquiry();
				     break;
				}
				case "2":
				{
					System.out.print("Enter withdarw amount: ");
					String s = br.readLine();
					double amt = Double.parseDouble(s);
					
					double withDrawAmount = acc1.withdraw(amt);
					System.out.println("WithDraw Amount: "+ withDrawAmount);
					
					acc1.balanceEnquiry();
					break;
				}
				case "3":
				{
					acc1.balanceEnquiry();
					break;
				}
				default :
					System.out.println("invalid option");
				}// switch case close
				System.out.println("Do you want to countinue (y/n)");
				option = br.readLine();
			}//do case close
			while(option.equalsIgnoreCase("yes"));
		}catch(InvalidAmountException  ie) {
			System.out.println(ie.getMessage());
		}catch(InSufficientFoundsException  e) {
			System.out.println(e.getMessage());
		}catch(IOException e1) {
			e1.printStackTrace();
		}
	}
}