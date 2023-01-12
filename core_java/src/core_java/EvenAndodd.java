package core_java;

public class EvenAndodd 
{
	public static void main(String[] args) {
		int arr[]= {10,20,38,40,58,30,49,67,14,86};
		int even=0;
		int odd=0;
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Content of the array");
		for(int i=0;i<10;i++)
		{
		 System.out.println(arr[i]);	
		}
		System.out.println("Total even numbers are "+even);
		
		System.out.println("Total odd numbers are "+odd);
	}
}

