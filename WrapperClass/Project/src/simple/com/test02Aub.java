package simple.com;

public class test02Aub {
	
	static void m1(Integer a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
	//	m1((byte)50);
	//	m1('a');
		m1(60);
	//	m1(70L);
	//	m1(78.12)

	//	m1(new Byte((byte) 60));
	//	m1(new Character('a'));
	//	m1(new Long(60));
		m1(new Integer(30));
	//	m1(new Double(83.32));
		
	}

}
