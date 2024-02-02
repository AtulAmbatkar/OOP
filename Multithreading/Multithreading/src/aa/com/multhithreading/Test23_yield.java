package aa.com.multhithreading;

class MyThread14 extends Thread {
	
	@Override
	public void run() {
		for(int i = 1 ; i<=10 ; i++) {
			System.out.println(i);
		}
	}
}
public class Test23_yield {
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		MyThread14 my = new MyThread14();
		my.start();
		
		Thread.yield();
		
		System.out.println("mian end");
				
	}
	

}
