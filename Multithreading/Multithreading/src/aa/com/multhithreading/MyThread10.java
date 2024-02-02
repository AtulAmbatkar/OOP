package aa.com.multhithreading;

public class MyThread10 extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("In run #3 : "+ getState());
		System.out.println("hi jon");
     	try {
			 Thread.sleep(2000);
			System.out.println("In run #3 : "+ getState());
		}catch(InterruptedException e) {
			
		}
	}

}
