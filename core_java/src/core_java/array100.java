package core_java;

public class array100 
{
 public static void main(String[] args) {
	int arr1[]= {10,20,30,40,56,44,24,45,76,98};
	int arr2[]= {22,34,65,45,67};
	System.out.println("Enter of the array 1: ");
	for(int i=0;i<10;i++)
	{
		System.out.println(arr1[i]+ " ");
		
	}
	System.out.println("Elements of the array B: ");
	for(int i=0;i<5;i++)
	{
		System.out.println(arr2[i]+" ");
		
	}
	arr_merge(arr1,10,arr2,5);
}
 public static void arr_merge(int arr1[],int aSize,int arr2[],int bSize) 
 {
	 int i;
	 int j = 0;
	 int k =0;
	 int v =0;
	 int max = aSize+bSize;
	 int[]r_arr=new int[50];
	 while(v<max)
	 {
		 if(j<aSize) {
			 r_arr[v]=arr1[j];
			 j++;
			 v++;
		 }
		 if(k<bSize)
		 {
			 r_arr[v]=arr2[k];
			 k++;
			 v++;
		 }
	 }
	 System.out.println("Enter of the Merged array R: ");
	 for(i=0;i<max;i++)
	 {
		 System.out.println(r_arr[i]+ " ");
	 }
 }
}
