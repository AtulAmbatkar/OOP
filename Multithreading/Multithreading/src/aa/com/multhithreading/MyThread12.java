package aa.com.multhithreading;

public class MyThread12 extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("\n From run strat");
		
        Thread th = Thread.currentThread();
		
		System.out.println(th.getId());
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println();
		
		Ex.m1();
		System.out.println("From run end");
			
	}

}
