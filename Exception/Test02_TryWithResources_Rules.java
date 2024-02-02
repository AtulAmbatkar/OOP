
import java.io.PrintStream;
public class Test02_TryWithResources_Rules {
	
	public static void main(String[]args) throws Exception {
		

	//#1.resource's variable and object must be 
	// Autocloseble type else ce:
		
		try(PrintStream ps = new PrintStream(System.out)){
			ps.println("hello");
		
		}
		// try(String s = "hi"){  ce:i.c.t
		//try(Object obj = new PrintStream(System.out)){ // does not implement ce:i.c.t
		 
		 try(AutoCloseable ae = new PrintStream(System.out)){  //not ce but ioException is required
				((PrintStream) ae).println("hi hk sir");	
		 }
	}
}
