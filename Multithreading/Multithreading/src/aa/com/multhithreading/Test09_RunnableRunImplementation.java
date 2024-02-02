package aa.com.multhithreading;

class MyRunnable3 implements Runnable {
	
	public void run() {	
		
			System.out.println("Thread Id: "+Thread.currentThread().getId()+ " is running.");
	}
}
public class Test09_RunnableRunImplementation {
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		MyRunnable3 customThread = new MyRunnable3();
		
		Thread th1 = new Thread(customThread);
		Thread th2 = new Thread(customThread);
		
		th1.start();
		th2.start();
		
		System.out.println("main end");
	}
	
}
