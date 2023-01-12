package core_java;

import java.util.Scanner;

public class array103 
{
	public static void main(String[] args) {
		//delete array element by position new
		int arr[]=new int[5];
		int position;
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n =scn.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		System.out.println("Content of the array");
		for(int i=0;i<n;i++) 
		{
			System.out.println(arr[i]);
			
		}
		System.out.println("Enter the position where you want to delete the elemnt");
		position = scn.nextInt();
		if(position>=n+1) {
			System.out.println("Delete errors: invalid position");
			
		}
		else
		{
			for(int i=position-1;i<n-1;i++)
			{
				arr[i]=arr[i+1];
			}
		}
		System.out.println("Array after deleteion of the element");
			for(int i=0;i<n-1;i++) 
			{
				System.out.println(arr[i]);
			}
	}

}
