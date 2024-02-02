package Focouse;

import java.util.LinkedHashSet;
import java.util.Set;

public class ElementSmalBigSort_babbleSort {
 
	public static void main(String[] args) {
		
		int[] element = {12,58,69,14,8,6,8,6,7,8};
		
		int i,j;
		int temp = 0;
		
		for( i=0; i<element.length; i++) {
			
			for(j = 1; j<element.length; j++) {
				
				if(element[j-1] > element[j]) {
					
					temp = element[j-1];
					element[j-1] = element[j];
					element[j] = temp;
				}
				
			}
		}
		
		Set<Integer>set = new LinkedHashSet<> ();
		
		for(int i1=0; i1<element.length; i1++) {
			
			set.add(element[i1]);
		}
		
		System.out.println(set);
		
		
	}
}
