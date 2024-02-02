
public class Test01 {
	
	static int a =  10;
	
	static {
		System.out.println("in sb a");
		System.out.println("a: "+a);
	//	System.out.println("b: "+b);
		System.out.println(Test02.b);
		System.out.println(Test02.getB());
	}

}
