package aa.with.resources;
import java.io.PrintStream;

public class Test01_TryWithRosources {
	
	
	public static void main(String [] args) {
		
		System.out.println("before try-with-resource");
		
		try(PrintStream ps = new PrintStream(System.out))
		{
			
			ps.println("hi");
		}
		System.out.println("after try-with resource");
		
	}

}
