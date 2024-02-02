package com.nareshit.logic;
import com.nareshit.exceptions.InSufficientFoundsException;
import com.nareshit.exceptions.InvalidAmountException;

public interface Bank {
	
	public void deposite(double amt) throws InvalidAmountException ;
	public double withdraw(double amt) throws InSufficientFoundsException;
	public void balanceEnquiry();

}
