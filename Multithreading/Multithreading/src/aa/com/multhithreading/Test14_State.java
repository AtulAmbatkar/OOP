package aa.com.multhithreading;

public class Test14_State {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		MyThread10 my = new MyThread10();
		System.out.println("In main #1: "+ my.getState());
		
		my.start();
		System.out.println("In main #2: "+my.getState());
		
		Thread.sleep(1000);
		System.out.println("In main #4: "+my.getState());
		
		Thread.sleep(2000);
		System.out.println("In main #5: "+my. getState());
	}

}
