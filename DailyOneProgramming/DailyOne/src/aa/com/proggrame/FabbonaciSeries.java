package aa.com.proggrame;

public class FabbonaciSeries {
	
	public static void main(String[] args) {
		
		int privious = 0 ;
		int next = 1;
		int result = 0 ; 
		
		for(int i =1 ; i<=10 ; i++) {
			
			System.out.print(privious + " ");

			result = privious + next;
//			System.out.println("Result: "+result);
			
			privious = next;
			next = result;
		}
//		System.out.println("Result: "+ result);
		
	}

}
