package packagecom.nit.aa.wc.practice;

public class Test01PVtoWco {
	public static void main(String[] args) {
		
		Integer i1 = new Integer(50);
		System.out.println(i1);
		
		Byte b1 = new Byte((byte)40);
		byte b2 = 60;
		Byte b3 = new Byte(b2);
		System.out.println(b1+" "+b3);
		Short sh1 = new Short((short)50);
		
		Long l1 = new Long(5);
		Float f1 = new Float(42.0);
		Double d1 = new Double(45);
		System.out.println(l1+" "+f1+" "+d1);
		
		Character  ch1 = new Character ('a');
		Boolean bo1 = new Boolean(true);
		System.out.println(ch1+" "+bo1);
		
		// not pooling in aplicable for constructor 
		// constructer alwayes creating new object 
		System.out.println();
		Integer i2 = new Integer(10);
		Integer i3 = new Integer(10);
		System.out.println(i2==i3);
		
		// pooling object is applied on 6 wrpper classes
		Integer i4 = Integer.valueOf(20);
		Integer i5 = Integer.valueOf(20);
		System.out.println(i4==i5);
		
		System.out.println();
		Byte b4 = new Byte((byte)10);
		Byte b5 = new Byte((byte)10);
		System.out.println(b4==b5);
		
		Byte b6 = Byte.valueOf((byte)50);
		Byte b7 = Byte.valueOf((byte)50);
		System.out.println(b6==b7);
		
		System.out.println();
		Short s3 = new Short((short)20);
		Short s4 = new Short((short)20);
		System.out.println(s3==s4);
		
		Short s5 = Short.valueOf((short)30);
		Short s6 = Short.valueOf((short)30);
		System.out.println(s5==s6);
		
		System.out.println();
		Long l2 = new Long(53);
		Long l3 = new Long(53);
		System.out.println(l2==l3);
		
		Long l4 = Long.valueOf(20);
		Long l5 = Long.valueOf(20);
		System.out.println(l4==l5);
		
		System.out.println();
		Character ch3 = new Character('a');
		Character ch4 = new Character('a');
		System.out.println(ch3==ch4);
		
		Character ch5 = Character.valueOf('b');
		Character ch6 = Character.valueOf('b');
		System.out.println(ch5==ch6);
		
		// no pooling applied on float and double "wc"
		System.out.println();
		Float f2 = Float.valueOf(20);
		Float f3 = Float.valueOf(20);
		System.out.println(f2==f3);
		
		System.out.println();
		Double d2 = Double.valueOf(50);
		Double d3 = Double.valueOf(50);
		System.out.println(d2==d3);
		
		System.out.println();
		Boolean bo2 = Boolean.valueOf(false);
		Boolean bo3 = Boolean.valueOf(false);
		System.out.println(bo2==bo3);
		
		// upto byte range -128 to 127 is applicable valueOf method
		// then above rane or below range is "creating is noe objet"
		// not appliable above the range or below range 
		System.out.println();
		Integer i8 = Integer.valueOf(150);
		Integer i9 = Integer.valueOf(150);
		System.out.println(i8==i9);
		
		// what is pooling?
		// if object is already executed with give value of method 
		// Does not creating new object is returning it's existing object.			
	
	}

}
