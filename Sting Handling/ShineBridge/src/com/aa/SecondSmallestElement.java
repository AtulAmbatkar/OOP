package com.aa;

public class SecondSmallestElement {
	
	public static void main(String[] args) {
		
		int[] number  = {12,8,66,5,86,84,75};
		
		findSecondSmallNumber(number);
		
		for(int i : number) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("second smallest number in the array is: " + number[1]);
	}

	private static void findSecondSmallNumber(int[] number) {
		
		for(int i=0; i<number.length; i++) {
			for(int j =0 ; j<i-1; j++) {
				if(number[j] > number[j+1] ) {
					
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}
		
	}

}
