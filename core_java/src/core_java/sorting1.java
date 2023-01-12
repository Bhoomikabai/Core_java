package core_java;

public class sorting1 
{  
	public static void main(String[] args) {
		int arr[]= {10,20,40,87,90};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			if(arr[i]<arr[j]) 
			{
		        int temp;
		        temp=arr[i];
				arr[i] =arr[j];
				arr[j]=temp;
			}	
		}
	}
		for(int i=0;i<arr.length;i++)
		System.out.println("assending order "+arr[i]);
		}
}