package aa.com.multhithreading;

public class Test01_executionMultiFlow {

	public static void main(String[] args) {
		
		System.out.println("main start");
		
		MyThread my = new MyThread();
		my.start();
		
		
		System.out.println("main end");
	}
}
