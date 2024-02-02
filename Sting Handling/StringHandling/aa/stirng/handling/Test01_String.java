package aa.stirng.handling;

import java.util.Arrays;

public class Test01_String {
	public static void main(String[] args) {
		
		String s = "";
		String s1=" ";
	    System.out.println(s.isEmpty());
	    System.out.println(s1.trim().isEmpty());
	    System.out.println(s1.isBlank());
	    System.out.println(s.equals(s1));
	    System.out.println();
	    
		
	    String s2 ="atul";
		String s3 = "atul";
		String s4 = "aTul";
		
		System.out.println(s3.equals(s2));
		System.out.println(s2==s1);
		System.out.println(s4.equalsIgnoreCase(s3));
		
		System.out.println(s4.compareTo(s3));
		System.out.println(s4.compareToIgnoreCase(s3));
		
		String s5= "atul";
		String s6 = "Atlb";
		
		System.out.println(s6.compareTo(s5));
		System.out.println(s6.compareToIgnoreCase(s5));
		
		String s7= "abc";
		String s8 = "abcdef";
		
		String s9 = "Programming World";
		
		System.out.println(s9.length());
		char ch1 = 0;
		for(int i=0; i<s9.length(); i++) {
			 ch1 =s9.charAt(i);
			System.out.print(ch1);
		}
	
		System.out.println("\n"+s9.indexOf('o'));
		System.out.println(s9.indexOf('o',5));
		
		System.out.println(s9.lastIndexOf('o',5));
		
		System.out.println(s9.indexOf('o',250));
		System.out.println(s9.lastIndexOf('o',250));
		
		System.out.println(s9.indexOf('o',-5));
		System.out.println(s9.lastIndexOf('o',-5));
		
		
		String a = "abc abc abc";
		String[] st = a.split("");
		System.out.println(Arrays.toString(st));
		
		st= a.split("a");
		System.out.println(st.length);
		System.out.println(Arrays.toString(st));
		
		st= a.split(" ");
		System.out.println(st.length);
		System.out.println(Arrays.toString(st));
		
		st= a.split("abc ");
		System.out.println(st.length);
		System.out.println(Arrays.toString(st));
		
		st= a.split(" abc");
		System.out.println(st.length);
		System.out.println(Arrays.toString(st));
		
		
		String sts = "Welcome to naresh it? ";
	    String[]  sts1 = sts.split(""); 
		System.out.println(sts1.length);
		
		
  }

}