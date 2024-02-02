package aa.exception.project;

public class Addition {
	
	static int add(int a,int b) throws IllegalArgumentException {
		
		if(a<0 || b<0 ) {
			throw new IllegalArgumentException("Don't pass wrong value");
		}
	
		return a+b;
		
	}
   
}