package com.learningcore.day1session;

import java.util.Scanner;

public class D01P43 {
public static void main(String [] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the size:");
	int size = sc.nextInt();
	int[]  array = new int[size];
	System.out.println("Enter the elements of the array:") ;
	for(int i = 0; i < size; i++) {
		array[i] = sc.nextInt();
		
	}
}
}
