package aa.collection.serialziable.student;

public class BobleSort{

   public static void main(String[] args) {
	
	   int[] element = {20,45,10,20,98,65,78,56,23,17,90};
	   
	    System.out.println(element.length);
	   
	    for(int i =0 ; i<element.length; i++) {
	    	System.out.print(element[i]+" ");
	    }
	    
	     boubleSort(element); 
	     System.out.println();
	    
	     for(int i=0; i<element.length; i++) {
	    	 System.out.print(element[i] + " ");
	     }
   }
   
   public static void boubleSort(int[] element) {
	  
	   int temp = 0;
	   
	   for(int i=0; i<element.length; i++) {
		   
		   for(int j =1; j<element.length; j++) {
			   
			   if(element[j-1]>element[j]) {
				   
				   temp = element[j-1];
				   element[j-1] = element[j];
				   element[j] = temp;   
			   }
		   }
	   }
   }
}
