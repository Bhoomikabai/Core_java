package core_java;


public class BiggestNumArray 
{
 public static void main(String[] args) 
{
 int[] arr = new int[] {10, 30, 20, 40, 50};
 int max=arr[0];
 for(int i=0;i<arr.length;i++)
 {
	
	if(arr[i]>max)
		max=arr[i];
 }
 System.out.println("biggest element in array list" +max);
 }
 

}
