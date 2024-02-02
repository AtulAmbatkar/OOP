package aa.collection.sun.collection;
import java.util.Arrays;

public class anargmsProgram {
	
	public static boolean anargms (String str1,String str2) {
		
		String claer1 = str1.replaceAll("\s", "").toUpperCase();
		String claer2 = str2.replaceAll("\s", "").toUpperCase();
		
		if(claer1.length()!=claer2.length()) {
			return false;
		}
		
		char[] arry1=claer1.toCharArray();
		char[] arry2=claer2.toCharArray();
		
		Arrays.sort(arry1);
		Arrays.sort(arry2);
		return true;
	}
	
	public static void main(String[] args) {
		
		String str1 = "Listen";
		String str2 = "Silent";
		
		if(anargms(str1,str2)) {
			System.out.println(str1+"&"+str2+" are anargms");
		}
		else {
			System.out.println(str1+"&"+str2+"are not anargms");
		}
	}

}
