package core_java;

public class frequency 
{ 
	public static void main(String[] args)  
{
	int [] arr = {1, 2, 8, 8,3, 2, 2, 2, 5, 1};  
    //Array for will store frequencies of element  
    int[] fr = new int[arr.length];  
    int a = -1;
     for(int i = 0; i < arr.length; i++)
     { 
    	int count = 1; 
        for(int j = i+1; j < arr.length; j++){  
            if(arr[i] == arr[j])
            { 
                count++;  
                          //To avoid counting same element again  
                fr[j] = a;  
            }
        }  
        if(fr[i] != a)  
            fr[i] = count;  
    }  

    //Displays the frequency of each element present in array  
    //System.out.println(" Element | Frequency");   
    for(int i = 0; i < fr.length; i++){  
        if(fr[i] != a)  
            System.out.println("    " + arr[i] + "    =    " + fr[i]);  
    }  
    
}
}
