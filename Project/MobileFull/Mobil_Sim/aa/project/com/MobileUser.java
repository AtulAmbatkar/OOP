package aa.project.com;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.spi.FileSystemProvider;

public class MobileUser {
	
	public static void main(String[] args) throws Exception {
		
		Mobile iphone = new Mobile();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Ensert sim: ");
		String simName = br.readLine();
		
		iphone.insertSIM(simName);
		System.out.println();
		
		System.out.println("Type 1 and press <Enter> key to send sms");
		System.out.println("Type 2 and press <Enter> key to make call\n");
		
		System.out.print("Enter option: ");
		String option = br.readLine();
		
		String resp;
		
		if(option.contains("1")) {
			System.out.println("Type mesage and <Enter> key");
			String msg = br.readLine();
			
			System.out.println("Type mobileNumber and press <Enter> key");
			String mobileNumber = br.readLine();
			
			resp = iphone.sendSMS(msg,Long.parseLong(mobileNumber));
			System.out.println(resp);
		}
		else if(option.contains("2")) {
			
			System.out.println("Type mobileNumber and press <Enter> key");
			String mobileNumber = br.readLine();
			
			resp = iphone.dialCall(Long.parseLong(mobileNumber));
			System.out.println(resp);
		}
		
		else {
			System.out.println("Invalid option press");
		}
	}

}