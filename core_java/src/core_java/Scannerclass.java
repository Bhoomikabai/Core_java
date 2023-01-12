package core_java;

import java.util.Scanner;

public class Scannerclass 
{
public static void main(String[] args) 
{
	int size = 2;
 int[]num = new int[size];
 Scanner scr = new Scanner(System.in);
 
 
 {
	 System.out.println("please enter the number to array");
	 num[0]=scr.nextInt();
 }
 for(int i=0;i<size;i++)
 {
	 num[i]=scr.nextInt();
 }
 //print the array
 for(int i=0;i<size;i++)
 {
	 System.out.println(num[i]);
 }
}
}
