package aa.stirng.handling.project;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class StringDuplicates {

	public static void main(String[] args) {
	   
	   String str = "atulAmbatkar";   
	   
	   Set<Character> set = new LinkedHashSet();
	   StringBuilder sb1 = new StringBuilder();
	   
	   for(int i=0; i<str.length(); i++) {
		   set.add(str.charAt(i));
	   }
	   for(Character ch1: set) {
//		   sb1.append(ch1);
		   str=str.valueOf(ch1);
		   System.out.print( str);
		   
		   sb1.append(ch1);
	   }
	   System.out.println("\nset: " +set);
	   System.out.println("stringBuffer: " +sb1);
	   System.out.println("String: " +(str));
	}
}
