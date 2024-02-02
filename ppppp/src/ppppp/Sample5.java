package ppppp;

public class Sample5 {
	
	private String s;
	private int age;
	
	// origanal Constructor
	Sample5(String s , int age){
		this.s = s;
		this.age = age;
	}
	
	// Duplicate constructor
	Sample5(Sample5 copySample5){
		this.s = copySample5.s;
		this.age = copySample5.age;
	}
	
	String getS() {
		return s;
	}
	
	int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		
		Sample5 sm = new Sample5("atul",24);
		
		Sample5 du = new Sample5(sm);
		
		System.out.println(sm.getS());
		System.out.println(du.getS());
		
		System.out.println(sm.getAge());
		System.out.println(du.getAge());
	}

}