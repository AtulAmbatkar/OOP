package com.aa;

import java.util.ArrayList;

public class StringCommonElement {
	
	public static void main(String[] args) {
		
		String[] name = {"atul","rushi","sukha","mukha","duka"};
		
		String[] name2 = {"rushi","sukha","mukha",};
		
		String[] CommonElement = findelement(name,name2);
		
		for(String s3 : CommonElement) {
			System.out.print(s3 +  " ");
		}
		
	}

	private static String[] findelement(String[] name, String[] name2) {
		
		ArrayList<String> element = new ArrayList<>();
		
		for(String s1 : name) {
			for(String s2 : name2) {
				if(s1.equals(s2)) {
					element.add(s1);
					break;
				}
			}
		}
		return  element.toArray(new String[1]);
	}

}
