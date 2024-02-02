package aa.com.multhithreading;

public class Test17_id {
	
	public static void main(String[] args) {
		
		Thread th = new Thread("Child-1");
		Thread th1 = new Thread("Child-2"); 
		
		System.out.println(th.getId() + " "+ th.getName());
		System.out.println(th1.getId() + " "+ th1.getName());
		
		MyThread11 my = new MyThread11();
		my.setName("Child-3");
		System.out.println(my.getId()+" "+my.getName());
		
		Thread th2 = Thread.currentThread();
		System.out.println(th2.getId()+" "+th2.getName());
		
	}

}
