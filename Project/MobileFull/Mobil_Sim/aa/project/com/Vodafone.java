package aa.project.com;

public class Vodafone implements SIM{
	
	public String sendSMS(String msg , long mobileNumber) {
		return "message is successfully sending? ";
	}
	
	public String dialCall(long mobileNumber) {
		return "this  mobile is outof service";
	}
	
	
}