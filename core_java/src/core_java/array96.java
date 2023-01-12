package core_java;

import java.util.Scanner;

public class array96 
{
 public static void main(String[] args) 
{
	int arr[]= {10,21,63,56,78,94,40,59,456,678};
	boolean found = false;
	Scanner scn =new Scanner(System.in);
	System.out.println("Enter the number element you want to search");
	int n=scn.nextInt();
	for(int i =0;i<10;i++) 
	{
		if(n==arr[i]) 
		{
			found = true;
			break;
		}
	}
	if(found) 
	{
		System.out.println("YES,number is present in the array");
	}
	else
	{
		System.out.println("No,number is NOT present in th array");
	}
}
}
