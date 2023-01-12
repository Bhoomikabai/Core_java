package core_java;

import java.util.Scanner;

public class RemoveDuplicate 
{
public static void main(String[] args) 
{
	int arr[] = new int[50];
	int n;
	int i,j,k;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size");
	n= sc.nextInt();
	
	System.out.println("Enter array elements");
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("content of the array");
	for(i=0;i<n;i++)
	{
		System.out.println(arr[i]+" ");
	}
	 for(i=0;i<n;i++)
	 {
		 for(j=i+1;j<n;)
			 
		 {
		 if(arr[j]==arr[i])
		 {
			 for(k=j;k<n;k++)
			 {
				 arr[k]=arr[k+1];
			 }
			 n--;
		 }
		 else
		 {
			j++;
		 }
		 }
	 }
	 System.out.println("conten of the array after duplicate removal");
	 
	 for(i=0;i<n;i++)
	 {
		 System.out.println(arr[i]+" ");;
	 }
}	

}
