package aa.com.waith.notify;

public class Test32_ITC_InterviewProgram {
	public static void main(String[] args) {
		
		new Thread(new OddNumberPrintingTask()).start();
		new Thread(new EvenNumberPrintingTask()).start();
	}

}
