package aa.com.multhithreading;

class MyThread15 extends Thread {
	
	public void run() {
		
		System.out.println("run start");
		try {
			Thread.sleep(1000);
			System.out.println("inturpt");
		}catch(InterruptedException e) {
			System.out.println("interrupt is raised");
		}
		System.out.println("run end");
	}
}
public class Test24_Sleep_Interrupt {

	public static void main(String[] args) throws Exception {
		
		System.out.println("main satrt");
		
		MyThread15 my = new MyThread15();
		my.start();
		
		my.interrupt();
		
//		my.sleep(150);
		
		System.out.println("main end");
	}
}
