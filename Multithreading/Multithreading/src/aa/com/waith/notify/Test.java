package aa.com.waith.notify;

class A implements Runnable{

	@Override
	public void run() {
	   for( int i=1; i<=10; i++){
		 if(i%2==0) {
			 PrintTat. printEvenMessage(i);
		 }
		   
	   }
		
	}
}

class B implements Runnable {
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			
			if(i%2!=0) {
				PrintTat.printMessage(i);
			}
		}
	}
}


class PrintTat {

	private static boolean number = false;
	public static synchronized void printMessage(int i) {
	if(number) {
		try {
			PrintTat.class.wait();
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		}
		System.out.println("evenNumber: "+i);
		number=true;
		PrintTat.class.notify();    //  is notify the second method waiting state :
	}                               // plase atul i requist to u reead carefull notify defination:
	
	public static synchronized void printEvenMessage(int i) {
		
		if(!number) {
		try {
			PrintTat.class.wait();
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		}
		System.out.println("evenNumber: "+i);
		number=false;
		PrintTat.class.notify();
	}
	
}

public class Test {
	public static void main(String[] args) {
		System.out.println("main Start: ");
		
      new Thread(new B()).start();
      new Thread(new A()).start();
    
	}
}
