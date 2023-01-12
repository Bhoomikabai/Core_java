package core_java;

import java.util.Scanner;

public class array97  
{
 public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,60,45,34,56};
	int b = 0;
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the number you want to search");
	int n=scn.nextInt();
	for(int i=0;i<10;i++)
	{
		if(n==arr[i]) {
			 b = i;
			break;
		}
	}
	if(b != 0)
	{
		System.out.println("Yes, numbere is present in the array at indext no.: "+b);
		
	}
	else
	{
		System.out.println("No,number is Not present in the array: ");
	}
}
}
