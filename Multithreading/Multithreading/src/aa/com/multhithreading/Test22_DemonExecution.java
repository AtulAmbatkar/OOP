package aa.com.multhithreading;

 class MyThread17 extends Thread {
	 
	 Thread th;
	 
	 MyThread17()  {
		 th = new Thread(this);
		 
		 th.setDaemon(true);
		 th.start();
	 }
	 
	 public void run() {
		 
		 System.out.println("Run: "+th.isDaemon());
		 
		 for(int i = 1; i<=100 ; i++) {
			 System.out.println("Run : "+i);
		 }
	 }
 }
public class Test22_DemonExecution {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("main start");
	
		MyThread17 my = new MyThread17();
//		my.start();
		
		System.out.println("Baba start the count ");
		
		for(int i = 1 ; i<=5 ; i++) {
			
			System.out.println("main : "+i);
		}
	
		System.out.println("main end");
	}

}
