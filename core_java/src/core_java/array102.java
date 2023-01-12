package core_java;

import java.util.Scanner;

public class array102 
{
public static void main(String[] args) {
	int arr[]=new int[50];
	int position=0;
	boolean found =false;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the numeber of elements in array");
	int n=scn.nextInt();
	System.out.println("Enter elements");
	for(int i=0;i<n;i++) 
	{
		arr[i]=scn.nextInt();
	}
	System.out.println("Enter the elements to be deleted");
	int elements=scn.nextInt();
	for(int i=0;i<n;i++) {
		if(arr[i]==elements) {
			found=true;
			position=i;
			break;
		}
	}
	if(found)
		for(int i=position;i<n-1;i++) {
			arr[i]=arr[i+1];
			
		}
else
	{
		System.out.println("elements is not found in the array");
	}
	System.out.println("array after deletion of the elemnts");
	//the array size gets reduce by 1 after deletion of the elements so we print upto n-1
	for(int i=0;i<n-1;i++) {
		System.out.println(arr[i]);
	}			
}
}
