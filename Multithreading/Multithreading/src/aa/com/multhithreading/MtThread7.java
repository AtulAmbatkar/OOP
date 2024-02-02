package aa.com.multhithreading;

public class MtThread7 extends Thread {

	 public void run() {
	 System.out.println("run start");
	 
	 Mythread8 my1 = new Mythread8 ();
	   my1 .start();
	 System.out.println("run end");
	 }
}