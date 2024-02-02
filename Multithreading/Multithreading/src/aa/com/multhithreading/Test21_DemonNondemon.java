package aa.com.multhithreading;

public class Test21_DemonNondemon {
	
	public static void main(String[] args) {
		
		Mythread8 my = new Mythread8();
		
		System.out.println("main :"+my.isDaemon()+" "+ my.getName()+" "+my.getId());
		
		my.setDaemon(true);
		System.out.println(my.isDaemon());
		
		my.start();
		
//		my.setDaemon(false);   after start methode we cannot create daemon or non-daemon
		
		
	}

}
