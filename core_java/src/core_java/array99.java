package core_java;

import java.util.Scanner;

public class array99 
{
 public static void main(String[] args) {
	int arr[]=new int[5];
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter elements of the array: ");
	for(int i=0;i<5;i++) 
	{
		arr[i]=scn.nextInt();
	}
	System.out.println("Unsorted order of the array: ");
	for(int i=0;i<5;i++)
	{
		System.out.println(arr[i]+" ");
		
	}
	//sorting procedure
	for(int i=0;i<5;i++)
	{
		for(int j=i+1;j<5;j++)
		{
			if(arr[i]<arr[j])
			{
				int t = arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
	}
	System.out.println("sorted order of the array(Decreasing order: ");
	for(int i=0;i<5;i++)
	{
		System.out.println(arr[i]+ " ");
	}
 }
}
