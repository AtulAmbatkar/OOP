package exception.project;

public class Addition {
	
	static int add(int a,int b)
                            throws NegativeNumberException {
		if(a<0 || b<0)
			 throw new NegativeNumberException("Dont pass -ve number");
		
		return a+b;
	}
}
