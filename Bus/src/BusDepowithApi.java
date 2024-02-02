import java.util.Scanner;

import org.w3c.dom.ranges.RangeException;
public class BusDepowithApi {

	public static void main(String[] args) {
		
		String vehiclName = null;
		
		try {
		
		Driver hk = new Driver();
		System.out.print("Enter class name: ");
		Scanner scn = new Scanner(System.in);
		vehiclName = scn.nextLine();
		
		Class cls = Class.forName(vehiclName);
		
		Object obj =cls.newInstance();
		
		if(obj instanceof Vehicle ) {
			Vehicle v = (Vehicle)obj;
			hk.drive(v);
		}else{
			System.out.println(vehiclName+"is not Vehicle type");
		}
		}catch(ClassNotFoundException e) {
			System.out.println("Error: "+vehiclName+".class is not found");
		}catch(IllegalAccessException e) {
			System.out.println("Error: no-param constructor is not visible in "+vehiclName+".class");
		}catch(InstantiationException e ) {
			System.out.println("Error: no-param constructor is found in:"+vehiclName+".class");		
		}		
		
	
	}
	
}
