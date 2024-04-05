package com.learningcourse.day2session;

import java.util.Scanner;

public class D02P51 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string");
		String input = sc.nextLine();
		
		int length = input.length();
		System.out.println("Length of the string :" + length);
		
		String uppercase = input.toUpperCase();
		System.out.println("uppercase string :" + uppercase);
		
		boolean isPalindrome = checkPalindrome(input);
		if(isPalindrome) {
			System.out.print("it is a palindrome");
		}else {
			System.out.print("it is not a palindrome");
		}
		
		
	}

	private static boolean checkPalindrome(String input) {
		// TODO Auto-generated method stub
		return false;
	}
}
