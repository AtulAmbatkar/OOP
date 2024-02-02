package aa.com.multhithreading;

public class SubThread extends Thread {

	public void run() {
		int y = 1;
		for(int i = 2 ; i <= 3 ; i++) {
			
			y = y - i;
			System.out.println(y);
		}
	}
}	

	