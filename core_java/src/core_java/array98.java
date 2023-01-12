package core_java;

import java.util.Scanner;

public class array98 
{
 public static void main(String[] args) 
 {
	 int arr[] =new int[5];
	 Scanner scn = new Scanner(System.in);
	 System.out.println("Enter elements of the array :  ");
	 for(int i=0;i<5;i++) {
		 arr[i]=scn.nextInt();
	 }
	 System.out.println("Unsorted Order of the array :  ");
	 for(int i=0;i<5;i++)
	 {
		 System.out.print(arr[i]+" ");
	 }
	 for(int i=0;i<5;i++)
	 {
		 for(int j=0;j<5;j++)
		 {
			 if(arr[i]>arr[j]) {
				 int t = arr[i];
				 arr[i]=arr[j];
				 arr[j]=t;
			 }
		 }
	 }
	 System.out.println("\n\nSorted Order of the array (Increasing Order):  ");
	 for(int i=0;i<5;i++)
	 {
		 System.out.println(arr[i]+"");
	 }

	 
}
}