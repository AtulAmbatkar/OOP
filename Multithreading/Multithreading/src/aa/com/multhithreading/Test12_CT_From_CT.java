package aa.com.multhithreading;

public class Test12_CT_From_CT {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MtThread7 my2 = new MtThread7();
		my2.start();
		
		System.out.println("main end");
	}

}
