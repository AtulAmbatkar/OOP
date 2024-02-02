package aa.com.synchoronised;

class PrintMessage {
	
	synchronized void printMsg(String msg) {
		System.out.println("["+msg);
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MessagePrinterThread implements Runnable {
	
	String msg ;
	PrintMessage pm ;
	Thread th;
	
	public MessagePrinterThread(PrintMessage pm , String msg) {
		
		this.pm = pm;
		this.msg = msg;
		
		th = new Thread(this);
//		System.out.println(this);
		th.start();
	}
	
	@Override
	public void run() {
		
		pm.printMsg(msg);
		
	}
}
public class MessagePrinterThreadUser {
	
	public static void main(String[] args) {
		
	   PrintMessage pm = new PrintMessage();
	   
	   MessagePrinterThread ob1 = new MessagePrinterThread(pm,"abc");
	   MessagePrinterThread ob2 = new MessagePrinterThread(pm,"bbb");
	   MessagePrinterThread ob3 = new MessagePrinterThread(pm,"ccc");
	}

}
