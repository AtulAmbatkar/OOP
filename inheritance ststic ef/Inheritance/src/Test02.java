
public class Test02 extends Test01 {
	
	static int b= 20;
	
	static {
		System.out.println("in b");
		System.out.println(a);
		System.out.println(b);
		System.out.println(getB());
	}

	public static int  getB() {
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println("in main");
		System.out.println(a);
		System.out.println(b);
	}

}