package core_java;

import java.util.Scanner;

public class arrayIndex96 
{
 public static void main(String[] args) {
	int arr[] = {29,30,50,294,56,60,30,34,985,321};
	int n;
	int found = -1;
	Scanner scn = new Scanner(System.in);
	n=scn.nextInt();
	for(int i=0;i<10;i++) 
	{
		if(n==arr[i]) 
		{
			found = i;
			break;
			
		}
	}
	if(found != -1)
	{
		System.out.println("YES,number is present in the array at the index: "+found);
		
	}
	else
	{
		System.out.println("NO,number is NOT present in the array "+found);
	}
}
}
