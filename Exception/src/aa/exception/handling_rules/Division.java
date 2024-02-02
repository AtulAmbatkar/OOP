package aa.exception.handling_rules;

public class Division {
	public static void main(String[] args) {	
		
		        try {
		        
		        int a = Integer.parseInt(args[0]);
				int b = Integer.parseInt(args[1]);
				
				int c = a/b;
				System.out.println("Result: "+ c);
		        } catch(ArrayIndexOutOfBoundsException e){
		        	System.out.println("please enter proper value");   	
		        }catch(ArithmeticException e) {
		        	System.out.println("plase do not pass second value as zero");
		        }catch(NumberFormatException e) {
		        	System.out.println("please input the integer only ");
		        }

	
		
	}
	

}
