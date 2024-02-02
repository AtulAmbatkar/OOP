package aa.com.multhithreading;

public class Test15_Priority {
	
	public static void main(String[] args) {
		 
		System.out.println("main start");
		
		Thread th = new Thread();
		Thread th1 = new Thread();
		
		System.out.println(th.getPriority());
		System.out.println(th1.getPriority());
		System.out.println();
		
		th.setPriority(7);
		th1.setPriority(9);
		
		System.out.println(th.getPriority());
		System.out.println(th1.getPriority());
		System.out.println();
		
		System.out.println(th.getName());
		System.out.println(th1.getName());
		
		th.start();
		th1.start();
		
		MyThread11 my2 = new MyThread11();
		System.out.println(my2.getPriority());
		my2.start();
		
//		Thread mainClass = Thread.currentThread();
//		System.out.println(mainClass);
//		System.out.println(mainClass.getId());
//		
		System.out.println("main end");
		
		
	}

}
