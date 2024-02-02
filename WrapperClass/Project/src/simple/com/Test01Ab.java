package simple.com;

public class Test01Ab {
	
	
	static void m1(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		m1((byte)50);
		m1('a');
		m1(60);
	//	m1(70L);
	//	m1(78.12)

		m1(new Byte((byte) 60));
		m1(new Character('a'));
	//	m1(new Long(60));
		m1(new Integer(30));
	//	m1(new Double(83.32));
		
		Character ch = new Character('a');
		 Character ch1 = new Character( (char) 97);
		
		Integer in = new Integer(98);
		
		Integer in1 = new Integer('n');
		
		Float f = new Float(88.22);
		Float f1 = new Float('b');
		System.out.println(f1);
	
		Integer in9 = new Integer((byte)'n');
		
		