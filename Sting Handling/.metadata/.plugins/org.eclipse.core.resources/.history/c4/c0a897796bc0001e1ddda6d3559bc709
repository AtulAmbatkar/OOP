package com.aa;

public class AsciiStringToNumber {
	
	public static void main(String[] args) {
		
		String name = "Atul";
		
		int[] value = findAscciValue(name);
		
		for(int v1 : value) {
			System.out.print(v1 + " ");
		}
	}

	private static int[] findAscciValue(String name) {
		
		int length = name.length();
		int[] asciiValue = new int[length];
		
		for(int i = 0; i<length; i++) {
			char character = name.charAt(i);
			asciiValue[i] = character;
		}
		
		return asciiValue;
	}

}
