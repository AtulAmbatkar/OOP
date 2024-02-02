
import java.util.Scanner;

public class ZoowithAPI {
	
	public static void main(String [] args) throws ClassNotFoundException,
	                                        InstantiationException,
	                                        IllegalAccessException { 
		
		Hkzoo hk  = new Hkzoo();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter class: ");
		String str = scn.next();
		
		Class cls = Class.forName(str);
		
		LivingThings lt = (LivingThings) cls.newInstance();
		
		hk.allow(lt);	
		
		

   }
}
