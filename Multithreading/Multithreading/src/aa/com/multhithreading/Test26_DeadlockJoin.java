package aa.com.multhithreading;

class MyThread18 extends Thread{
	
	private MyThread19 mt19 ;
	
	public void setM19(MyThread19 mt19){
		this.mt19 = mt19;
	}
	
	public void run() {
		System.out.println("m18 run start");
		try {
			mt19.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("m18 run end");
	}
}

class MyThread19 extends Thread {
	
	private MyThread18 mt18;
	
	public void setM18(MyThread18 mt18) {
		this.mt18= mt18;
	}
	
	public void run() {
		System.out.println("m19 run start");
		try {
			mt18.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("m19 run end");
	}
}
public class Test26_DeadlockJoin {
		public static void main(String[] args) {
			
			MyThread18 m18 = new MyThread18();
			MyThread19 m19 = new MyThread19();
			
			m18.setM19(m19);
			m19.setM18(m18);
			
			m18.start();
			m19.start();
			
		
	}

}
