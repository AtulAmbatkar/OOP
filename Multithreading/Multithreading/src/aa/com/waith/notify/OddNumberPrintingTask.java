package aa.com.waith.notify;

public class OddNumberPrintingTask implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			
			if(i%2!=0)
				PrintNumber.printOddNumber(i);
		}

	}

}
