package com.learningcore.day1session;

import java.util.Scanner;

public class D01P41 {

public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.print("Enter two numbers");

int num1 = sc.nextInt();
int num2 = sc.nextInt();

int[] array = {7,25,5,19,30};
 boolean foundnum1 = false;
 boolean foundnum2 = false;
 
 for(int i = 0; i< array.length; i++)
	 if (array[i] == num1) {
		 foundnum1 = true;
	 }

 	if (array[i] == num2) {
 		foundnum2 = true;
 	}

if(foundnum1 && foundnum2) {
	System.out.print("its Bingo");
}else {
	System.out.print("Not found");
}

}
}


