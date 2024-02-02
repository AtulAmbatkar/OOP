package aa.stirng.handling;
import java.util.Arrays;

public class SortingString {
	public static void main(String[] args) {
		
		String s = "How are you?";
//		String[] s1 = s.split(" ");
//		System.out.println(s1.length);
//		System.out.println(Arrays.toString(s1));
//    	System.out.println();
//    	
//    	String s3 = s1[2]+s1[1]+s1[0];
//		
//		 System.out.print(s3+" ");
		 
		String[] s1 = s.split(" ");
//		System.out.println(Arrays.toString(s1));
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=s1.length-1; i>=0; i--) {
			
			sb.append(s1[i]);
			sb.append(" ");
		}
		sb.toString().trim();
		
		System.out.println(sb);
		
	}

}
