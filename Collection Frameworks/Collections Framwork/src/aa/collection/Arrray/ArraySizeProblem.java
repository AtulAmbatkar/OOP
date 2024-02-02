package aa.collection.Arrray;

public class ArraySizeProblem {

	public static void main(String[] args) {
		
		String[] sa = new String[8];
		
		sa[0] = "a";
		sa[1] = "b";
		sa[2] = "c";
		sa[3] = "d";
		sa[4] = "e";
		sa[5] = "f";
		sa[6] = "e";
		sa[7] = "g";
		System.out.println("object stored successfully");
		System.out.println(sa.length);
//		sa[8] = "h";
		
		String[] sa2 = new String[15];
		 
		  for(int i=0; i<sa.length; i++) {
			  sa2[i] = sa[i];
		  }
		  sa = sa2;
		  
		  sa[8] = "h";
		  System.out.println("next object stored successfully");
	}
}
