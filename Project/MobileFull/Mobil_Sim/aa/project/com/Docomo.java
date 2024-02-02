package aa.project.com;

public class Docomo implements SIM {

	@Override
	public String sendSMS(String meg, long mobileNumber) {
		return "msg sending is successfully?  " ;
	}

	@Override
	public String dialCall(long mobileNumber) {
		return "mobile is switchoff";
	}

	
}
