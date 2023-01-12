package core_java;

import java.util.Scanner;

public class CharecterArray 
{
public static void main(String[] args) 
{
 Scanner scn = new Scanner(System.in);
 System.out.println("Enter charecters");
 /* For user input,use the scanner class with system.in after getting the input,convert 
 into character array*/
 char[] a=scn.next().toCharArray();
 System.out.println("values are");
 /* Display it until the length of the character array i.e number of elements
  input by the user*/
 for(int i=0;i<a.length;i++)
 {
	 System.out.println(a[i]);
 }
}
}
