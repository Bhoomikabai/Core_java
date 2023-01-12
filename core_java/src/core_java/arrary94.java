package core_java;

import java.util.Scanner;

public class arrary94 
{
 public static void main(String[] args) 
 {
  int arr[]=new int[5];
  Scanner scn=new Scanner(System.in);
  System.out.println("Enter elements of the array: ");
  for(int j=0;j<5;j++)
  {
	  arr[j]=scn.nextInt();
  }
  System.out.println("Content of  array: ");
  for(int k=0;k<5;k++) {
	  System.out.println(arr[k]);
  }
  System.out.println("Content of the array in reverse order: ");
  for(int l=4;l>=0;l--) {
	  System.out.println(arr[l]);
  }
 }
}
