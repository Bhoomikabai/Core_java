package Praties;

import java.util.Scanner;

public class bubble {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i =0;i<5;i++) {
		 arr[i]=scn.nextInt();
		}
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<=5;j++) {
				
		    if(arr[i]>arr[j])
		    {
		    	int a = arr[i];
		    	arr[i]=arr[j];
		    	arr[j]=a;
		    			    	
		    }
			}
		}
		System.out.println("sorted array");
		for(int i =0;i<5;i++)
		{
			System.out.println(arr[i]+"");
		}
	}

	 
		 }  
	



