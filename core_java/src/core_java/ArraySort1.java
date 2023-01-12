package core_java;

import java.util.Arrays;

public class ArraySort1 {
	public static void main(String[] args) {

		int[] arry = {10,20,20,20,30,10,40};
		Arrays.sort(arry);
		System.out.println("Sorted arrays: ");
		for(int i=0;i<arry.length;i++)
		{
			System.out.println(arry[i]);
		}
		int count =1;
		for(int i=0;i<arry.length-1;i++) {
			if(arry[i]==arry[i+1]) {
				count++;
			}
			else
			{
				
			System.out.println(arry[i]+"="+count);
			count=1;
			}
	
			 
			
		}
		System.out.println(arry[arry.length-1]+"="+1);

	}
}