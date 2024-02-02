package aa.com.multhithreading;

public class Test20_toString {
	
	public static void main(String[] args) {
		
		Thread th = new Thread();
		System.out.println(th);
		
		Thread th2 = new Thread("Child-1");
		System.out.println(th2);
		
		Thread th3 = Thread.currentThread();
		System.out.println(th3);
		
		Thread th4 = new Thread();
		System.out.println(th4);
		
		th.setName("child-2");
		System.out.println(th);
		
		
		
		th3.setPriority(7);
		
		Thread th6 = new Thread();
		System.out.println(th6);
	}

}
