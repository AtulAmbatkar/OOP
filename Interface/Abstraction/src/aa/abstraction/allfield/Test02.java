package aa.abstraction.allfield;

public class Test02 extends B{

	 public void m() {
		B b = new B();
		System.out.println(super.x);
		
		super.add();
		
	 }
	public static void main(String[] args) {
		
		Test02 ta = new Test02();
		ta.m();
		System.out.println("hi");
	}

	
}
