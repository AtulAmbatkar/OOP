package aa.exception.handling_rules;

public class Test01{
	
	public static void main(String []args ) {
		
		// #1.ony try is not allowed 
		// try {}
		
		// #2.we can try:> catch:> finally
		try  { }
	//	finally {};
		catch(ArithmeticException e) {}
		
		finally {}
		
		// #3.after final we cannot place the catch block
		// catch(NumberFormatException e) {}
		
		//#4.
		try {}
		finally {}
		
		try {}
		catch(ArrayIndexOutOfBoundsException e) {}
		
		// # 5.finall not allowed starting 
		// finally {}
	    try {}
	    catch(ArrayIndexOutOfBoundsException e) { }
		
		   	}
	
}