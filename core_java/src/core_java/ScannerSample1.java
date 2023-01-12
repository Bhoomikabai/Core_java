package core_java;

import java.util.Scanner;

public class ScannerSample1 
{
 public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter element to array");
	int size = scn.nextInt();
	int[] b = new int[size];
	//storing elements to array
	System.out.println("enter elements to array");
	for (int i =0; i< size; i++)
	{
		b[i]=scn.nextInt();
	}
	//print array
	for (int i=0;i<size;i++)
	{
		System.out.println(b[i]);
	}
}
}
