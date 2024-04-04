package com.learningcore.day1session;

import java.util.Scanner;

public class D01P33 {
public static void main(String[]args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the percentage obtained:");
 double percentage = sc.nextDouble();
 
 String grade;
 
 if(percentage >= 60) {
	 grade = "A Grade";
 }else if (percentage >= 45) {
	 grade = "B Grade";
 }else if (percentage >= 35) {
	 grade = "c Grade";
 }else {
	 grade = "Fail";
 }
  System.out.println(grade);
}
}
