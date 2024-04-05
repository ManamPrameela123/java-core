package com.learningcourse.day2session;

import java.util.HashSet;
import java.util.Scanner;

public class D02P58 {
	public static void main(String[] args) {
//		String input1 = "Hello world";
//		String input2 = "aaabb";
//		
//		System.out.print(canBeSplit(input1));
//		System.out.print(canBeSplit(input2));
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String length = canBeSplit(input);
		System.out.print("Enter a string" + length);

	}
	
	public static String canBeSplit(String s) {
		if(s.length() < 4) {
			
		return "No";
	}
		HashSet<String> set = new HashSet<>();
		for (int i = 1; i < s.length(); i++) {
			for(int j = i + 1; j < s.length(); j++) {
				for(int k = j+1; k<s.length(); k++) {
					String first = s.substring(0, i);
					String second = s.substring(i, j);
					String third = s.substring(j, k);
					String fourth = s.substring(k);
					
					set.clear();
					set.add(first);
					set.add(second);
					set.add(third);
					set.add(fourth);
					
					if(set.size() == 4) {
						return "yes";
					}



					
				}
			}
		}
		
		return "No";
		
	}
}
