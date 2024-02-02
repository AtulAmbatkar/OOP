package aa.com.multhithreading;

public class Ex {

	static void m1() {
		
		System.out.println("\n From m1 start");
		
        Thread th = Thread.currentThread();
		
		System.out.println(th.getId());
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		
		System.out.println(" From m1 end");
		System.out.println();
	}
}
