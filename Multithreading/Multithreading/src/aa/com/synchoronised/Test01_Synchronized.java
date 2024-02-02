package aa.com.synchoronised;

class Addition {
	 int x;
	 int y;
	 
//	 void add(int x , int y) {
	synchronized void add(int x , int y) {   // at the time multiple thread modifying 
		this.x = x;                          // same objec ref.to data then we must declesr as
		this.y = y;                          // synchronized method 
		                                   
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		int result = this.x + this.y;
		System.out.println(Thread.currentThread().getName()+" Result: "+result);
	}
}

class Thread1 extends Thread {
	Addition a ;
	
	Thread1(Addition a){
		this.a = a;
	}
	
	public void run() {
		a.add(50,60);
	}
}
class Thread2 extends Thread {
	Addition  b;
	
	Thread2(Addition b){
		this.b = b;
	}
	
	public void run() {
		b.add(70,80);
	}
}
public class Test01_Synchronized {
	public static void main(String[] args) {
		
		Addition a = new Addition ();
		
		new Thread1(a).start();
		new Thread2(a).start();
	}

}
