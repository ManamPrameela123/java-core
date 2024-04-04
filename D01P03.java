package com.learningcore.day1session;

import java.util.Scanner;

public class D01P03 {
	
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number between 1 and 12:");
int monthNumber = sc.nextInt();
String monthName;
switch(monthNumber) {
case 1:
	monthName = "January";
	break;
case 2:
	monthName = "february";
	break;
case 3:
	monthName = "march";
	break;
case 4:
	monthName = "april";
	break;
case 5:
	monthName = "may";
	break;
case 6:
	monthName = "june";
	break;
case 7:
	monthName = "july";
	break;
case 8:
	monthName = "august";
	break;
case 9:
	monthName = "september";
	break;
case 10:
	monthName = "october";
	break;
case 11:
	monthName = "november";
	break;
case 12:
	monthName = "december";
	break;
	
default:
	monthName = "Invalid input";
	
	break;
	
	
}

	System.out.println(monthName);
}
}
