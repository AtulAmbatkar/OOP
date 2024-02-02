package aa.com.multhithreading;

public class Test19_currGroup {
	
	public static void main(String[] args) {
		
		Thread th = new Thread();
		System.out.println(th.getThreadGroup().getName());
		
		Thread th1 = new Thread();
		System.out.println(th.getThreadGroup().getName());
		
		Thread th2 = Thread.currentThread();
		System.out.println(th2.getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		ThreadGroup gpA = new ThreadGroup("Group A");
		
		Thread th3 = new Thread(gpA,"Child-a");
		Thread th4 = new Thread(gpA,"Child-b");
		System.out.println(th3.getThreadGroup().getName());
		System.out.println(th4.getThreadGroup().getName());
		
		Thread th5 = new Thread();
		System.out.println(th5.getThreadGroup().getName());
	}

}
