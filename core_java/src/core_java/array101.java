package core_java;

import java.util.Scanner;

public class array101 
{
public static void main(String[] args) {
	int arr[]=new int[50];
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter array size");
	int n=scn.nextInt();
	System.out.println("Enter"+n+"array elements");
	for(int i=0;i<n;i++) 
	{
	 arr[i]=scn.nextInt();	
	}
	/*System.out.println("Content of the array");
	for(int i=0;i<n;i++) 
	{
		System.out.println(arr[i]+" ");	
	}*/
	System.out.println("Enter the position where you want to insert a new element: ");
	int position = scn.nextInt();
	
	System.out.println("Enter the value");
	int value=scn.nextInt();
	for(int i=0;i>position;i++) 
	{
		arr[i+1]=arr[i];
	}
	arr[position-1]=value;
	System.out.println("Array after insertion of the new elements");
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]+" ");
	}
}
}
