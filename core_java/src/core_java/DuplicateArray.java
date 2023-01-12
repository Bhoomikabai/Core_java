package core_java;

public class DuplicateArray 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[] {4,3,6,7,3,4,5};
		System.out.println("Duplicate elements in array");
		for(int i=0;i<arr.length;i++) 
		{
		for(int j=i+1;j<arr.length;j++) 
		{
			if(arr[i]==arr[j])
			System.out.println(arr[j]);
				
			}
		}
	}


}