package aa.com.waith.notify;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class  MYRunnable1  {

	public synchronized void m1() {
		
		System.out.println("hi");
		try {
			wait();
			System.out.println("by");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		notify();
	}
	 
}

 class MyThread extends Thread{
	 
	 @Override
	 public void run() {
		 System.out.println("atul are you here: ");
	 }
 }
 
public class Test_33_WaitRules {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		MYRunnable1 mr = new MYRunnable1();
		
		MyThread my = new MyThread();
				my.start();
		
	
		
//		synchronized(my) {
//			my.wait();
//		}
				synchronized(my) {
					my.wait();
				}
	    System.out.println("main");
	    
		
	    mr.m1();
		
		
	}

}
