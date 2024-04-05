package com.learningcourse.day2session;

public class D02P59 {

	public static void main(String[] args) {
		String input = "Mr John Smith";
		System.out.print(replaceSpaces(input));
	}
	
	public static String replaceSpaces(String s) {
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(c == ' ') {
				sb.append("%20");
			}else {
				sb.append(c);
			}
		}
		return sb.toString();
		
	}
}
