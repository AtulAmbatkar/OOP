package aa.com.waith.notify;

public class PrintNumber {

	private static boolean oddNumberPrinted;

	public static synchronized void printOddNumber(int i) {
		  
		if(oddNumberPrinted) {
			try {
				
				PrintNumber.class.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print(i + " ");
		oddNumberPrinted= true;
		
		PrintNumber.class.notify();
		
	}

	public static synchronized void printEvenNumber(int i) {
		if(!oddNumberPrinted) {
			try {
				PrintNumber.class.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print(i + " ");
		oddNumberPrinted=false;
		
		PrintNumber.class.notify();
	}
}
