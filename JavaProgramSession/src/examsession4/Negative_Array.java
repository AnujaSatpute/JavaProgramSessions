package examsession4;
//Q3)	WAP to print all negative elements in an array and also count total number of 
//negative elements in an array.

import java.util.Scanner;

public class Negative_Array {
    static  void negativeArray(int arr[]) {
    	  int count =0;
    	 
    	  for(int i =0;i<arr.length;i++) {
    		  System.out.println(arr[i]);
    		  if(arr[i]<0) {
    			  count ++;
    		  }	  
    	  }
    	  System.out.println("Negative elements in an array :"+count);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        System.out.println("Array element :");
        int arr[]= new int[size];
        for(int i =0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
      
        negativeArray(arr);
	}

}
