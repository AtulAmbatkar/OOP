package aa.project.com;



public class Mobile {
	private SIM sim;

    public void insertSIM(String simName) throws Exception {
        Class<?> simClass = Class.forName(simName);
        Object simObject = simClass.getDeclaredConstructor().newInstance();

        if (simObject instanceof SIM) {
            sim = (SIM) simObject;
        } else {
            throw new Exception("Sim is not valid");
        }
    }

    public String dialCall(long mobileNumber) {
        return sim.dialCall(mobileNumber);
    }

    public String sendSMS(String msg, long mobileNumber) {
        return sim.sendSMS(msg, mobileNumber);
    }
}
