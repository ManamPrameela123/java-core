package com.learningcore.day1session;

import java.util.Scanner;

public class D01P35 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	
	int number = sc.nextInt();
	int factorial = 1;
	for(int i = 1; i <= number ; i++) {
		factorial *= i ;
		}
	System.out.println("factorial of" + number + "is" + factorial);
}
}
