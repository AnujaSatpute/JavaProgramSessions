package demo1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {5,7,8,4,11,13,45,78,17};
//		PrimeEle obj = new PrimeEle();
//		obj.primeNumber(arr);
		
		int[] array = new int [5];
	    Scanner in = new Scanner (System.in);

	    System.out.println("Enter the elements of the array: ");
	    for(int i=0; i<5; i++)
	    {
	        array[i] = in.nextInt();
	    }
	
	    for(int i=0; i<array.length; i++){
	        boolean isPrime = true;
	        if (array[i] == 1)
                isPrime = false;
            else {
                // check to see if the numbers are prime
                for (int j = 2; j <= array[i] / 2; j++) {
                    if (array[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
	
	        }
	        if(isPrime)
	        	System.out.println(array[i] + " are the prime numbers in the array ");
	        else
		    	System.out.println(array[i]+"are not the prime numbers in the array");
	    }
	    
	}

}
