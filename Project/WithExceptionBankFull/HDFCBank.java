package com.nareshit.logic;
import com.nareshit.exceptions.*;

public class HDFCBank implements Bank {
	
	private double balance;
	
	@Override
	public void deposite(double amt) throws InvalidAmountException {
		if(amt<=0) {
			  throw new InvalidAmountException(amt +": invalid amt");
		}
		  balance = amt + balance;
	}
	
	public double withdraw(double amt) throws InSufficientFoundsException {
		if(amt>balance) {
			throw new InSufficientFoundsException("InSufficient Founds ");
		}
		
		balance = balance - amt;
		return amt;
	}
	
	public void balanceEnquiry() {
		System.out.println("Current balance: "+ balance);
	}

	
		
}
