package aa.com.multhithreading;

public class Test11From {

	 public static void main(String[] args) {
			System.out.println("main start");
			
			AddThread my1 = new AddThread();
			
			SubThread my2 = new SubThread();
			
			my1.start();
			my2.start();
			
			
		}
	 }

