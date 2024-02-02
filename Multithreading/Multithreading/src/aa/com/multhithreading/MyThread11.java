package aa.com.multhithreading;

public class MyThread11 extends Thread {
	
	@Override
	public void run() {
		for(int i= 1 ; i<=20 ; i++) {
			System.out.println(getName()+" "+i);
		}
	}

}
