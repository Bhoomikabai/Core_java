package Praties;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		String str,rev="";
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		str=scn.nextLine();
		int length = str.length();
		for(int i=length-1;i>=0;i--)
			rev=rev+str.charAt(i);
		if(str.equals(rev))
		System.out.println(str + "is a palindrome");
		else
		System.out.println(str + "Is not a palindrome");
		
		
	}

}
