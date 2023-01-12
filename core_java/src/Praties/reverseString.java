package Praties;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		String str,reversedstr = "";
		System.out.println("Enter a string");
		Scanner scn = new Scanner(System.in);
		str=scn.nextLine();
		int length = str.length();
		for(int i = length-1;i>=0;i--) 
			reversedstr = reversedstr + str.charAt(i);
			System.out.println(str);
			System.out.println(reversedstr);
		}
		
	}

