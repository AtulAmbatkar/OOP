package aa.com.multhithreading;

public class Test16_name {
	
	public static void main(String[] args) {
		
		Thread th = new Thread();
		Thread th1 = new Thread("Child-2");
		
		System.out.println(th.getName());
		System.out.println(th1.getName());
		System.out.println();
		
		th.setName("Child-1");
		
		System.out.println(th.getName());
		System.out.println(th1.getName());
		System.out.println();
		
		Thread th2 = new Thread();
		System.out.println(th2.getName());
		
		Thread th3 = new Thread((Runnable)null);
		System.out.println(th3.getName());
		
		Thread th4 = new Thread((Runnable)null,"Child-3");
		System.out.println(th4.getName());
		
		Thread th5 = new Thread();
		System.out.println(th5.getName());
		System.out.println();
		
		Thread th6 = new Thread("Child-4");
		Thread th7 = new Thread("Child-4");
		System.out.println(th6.getName());
		System.out.println(th7.getName());
		System.out.println();
		
		MyThread11 my1 = new MyThread11();
		MyThread11 my2 = new MyThread11();
		
		my1.setName("Child-5");
	    my2.setName("Child-6");
	    
	    my1.start();
	    my2.start();	
		
	}

}
