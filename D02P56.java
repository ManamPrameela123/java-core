package com.learningcourse.day2session;

import java.util.Scanner;

public class D02P56 {

	public static void main(String[] args) {
//		String input1 = "aabcdaabc";
//		int length = longestprefixsuffix(input1);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string");
		String input = sc.nextLine();
		int length = longestprefixsuffix(input);
		System.out.print("length of longest prefix which is also suffix" + length);
	}
	
	public static int longestprefixsuffix(String str) {
		int n = str.length();
		int[] lps = new int[n];
		computelpsArray(str, n, lps);
		return lps[n-1];
		
	}
	private static void computelpsArray(String str, int n, int[]lps) {
		int len = 0;
		int i = 1;
		lps[0] = 0;
		
		while(i<n) {
			if(str.charAt(i) == str.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			
			}else {
				lps[i] = 0;
				i++;
			}
		}
		
	}
}
