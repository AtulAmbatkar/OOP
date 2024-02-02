package aa.stirng.handling.project;



import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringNumber {

	public static void main(String[] args) {
		
		Map<Character,Integer> map = new TreeMap<>();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String: ");
	
		while(true) {
		try {
			String string = scn.nextLine();
			checkString(string);
//			System.out.println(string);555
			
			char[] ch = string.toCharArray();
			
			for(int i=0; i<ch.length;i++) {
				
				char ch1 = ch[i];
				
				if(!map.containsKey(ch1)) {
					map.put(ch1,1);
				}
				else {
					int value = map.get(ch1);
					
					map.put(ch1, value+1);
				}
			}
			System.out.println(map);
		break;
		}catch (IllegalArgumentException e) {
			System.out.println("plase i requst to you put only string: ");
		}
	  }
	}
	private static void checkString(String string) {
//		   if(string.matches("[0-9A-Z-*/+!@#$^&*()_+=]+")) {
			   if(!string.matches("[a-zA-Z]+")) {
			   throw new IllegalArgumentException();
		   }
	}
}
