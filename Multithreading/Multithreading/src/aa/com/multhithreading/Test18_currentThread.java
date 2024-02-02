package aa.com.multhithreading;

public class Test18_currentThread {
	
	public static void main(String[] args) {
		
		Thread th = Thread.currentThread();
		
		System.out.println(th.getId());
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println();
		
		th.setName("my cut Main Thread");
		th.setPriority(10);
		
		System.out.println(th.getId());
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println();
		
		Ex.m1();
		
		MyThread12 my = new MyThread12();
		
		my.run();
		System.out.println();
		
		my.start();
		
	}

}
