package com.learningcore.day1session;

import java.util.Scanner;

public class D01P32 {
 public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number between 1 and 7:");
	int daynumber =sc.nextInt();
	String dayname;
	if (daynumber == 1) {
		dayname = "sunday";
	} else if (daynumber == 2) {
		dayname = "monday";
    } else if (daynumber == 3) {
		dayname = "Tuesday";
   }  else if (daynumber == 4) {
	dayname = "wednesday";
  }  else if (daynumber == 5) {
	dayname = "thursday";
  }  else if (daynumber == 6) {
	dayname = "friday";
  } else if (daynumber == 7) {
	dayname = "saturday";
  } else {
	  dayname = "Invalid input";
  }
	
	System.out.println(dayname);
 }
	  
	  

	
 }

