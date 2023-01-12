package core_java;

public class SmallestNumArray 
{
	 public static void main(String[] args) 
	{
	 int[] arr = {10, 5, 20, 40, 50};
	// 'min' method is used to find the minimum element
     // from Collections Class
	 int min=arr[0];
	 for(int i=0;i<arr.length;i++)
	 {
			
			if(arr[i]<min)
			min=arr[i];
	 }
	 
	 System.out.println("smallest element in array list" +min);
	 }
	 

	}


