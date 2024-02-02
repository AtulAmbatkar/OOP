package aa.com.multhithreading;


class MyThread6 extends Thread {
	
    public void run() {
    	
    	System.out.println("Thread ID: "+Thread.currentThread().getId()+" is running ");
    }
}
public class Test10_ThreadRunImplementation {

    public static void main(String[] args) {
		
    	System.out.println("main start");
    	
    	MyThread6 customThread1 = new MyThread6();
    	MyThread6 customThread2 = new MyThread6();
    	
    	customThread1.start();
    	customThread2.start();
    	
    	System.out.println("main end");
	}
}
