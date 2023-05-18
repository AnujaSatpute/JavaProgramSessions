package examsession4;
//WAP to find the second smallest element in an array
import java.util.Arrays;

public class SecondSmallest_Array {

	public static int getSecondSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {5,66,3,25,66,5,9};
      System.out.println("Array element :"+Arrays.toString(arr));
     System.out.println("Second Smallest element :"+ getSecondSmallest(arr,7));
	}

}
