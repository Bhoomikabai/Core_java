package core_java;

import java.util.Scanner;

public class array2 
{
 public static void main(String[] args) 
{
 int arr[] = new int[5];
 Scanner scn = new Scanner(System.in);
 System.out.println("Enter elements of the array");
 for(int i=0;i<5;i++)
 {
	 System.out.println("Enter the value for arr["+i+"]");
     arr[i]= scn.nextInt();
 }
 System.out.println("Content of the array");
 for(int i=0;i<5;i++) {
	 System.out.println("value at arr["+i+"]"+arr[i]);
 }
 
}
}
