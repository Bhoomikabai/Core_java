package core_java;

public class Array108 
{
	public static void main(String[] args) {
		int arr[] = {11,11,11,22,33,44,55,66,77,55};
		int count=0;
		int n=0;
		System.out.println("Enter the number you want to search");
		for(int i=0;i<10;i++)
		{
			if(n==arr[i])
			count++;
		}
		System.out.println("count of the array");
		for(int i=0;i<10;i++) 
		{
			System.out.println(arr[i]);
			
		}
		System.out.println("Number of occurance of in the aray is"+count);
		
	}
	

}
