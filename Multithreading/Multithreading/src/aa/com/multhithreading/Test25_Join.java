package aa.com.multhithreading;

class MyThread16 extends Thread {
	
	@Override
	public void run() {
		System.out.println("run start");
		
		System.out.println("run end");
	}
}
public class Test25_Join {
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		MyThread16 my = new MyThread16();
		my.start();
		
		try{
			my.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end");
	}

}
