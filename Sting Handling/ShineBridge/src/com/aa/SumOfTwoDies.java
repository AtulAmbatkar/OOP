package com.aa;

import java.util.Random;

public class SumOfTwoDies {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int dies1 = ran.nextInt(3) + 1;
		int dies2 = ran.nextInt(3) + 1;
		
		int sum = dies1 + dies2 ;
		
		System.out.println("rolling dies: ");
		System.out.println("rolling first dies: " + dies1);
		System.out.println("rolling second dies: " + dies2);
		System.out.println(sum);
		
	}

}