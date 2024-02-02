package aa.com.multhithreading;

public class MyThread9 extends Thread {
	
	@Override
	public void run() {
		
		System.out.println(getName() + "start");
		
		MyThread9 my = new MyThread9();
		my.start();
		System.out.println(getName() + "end");
		
//		while(true) {
//		 System.out.println(getName() + "back Excution");
//		}
	}
}
