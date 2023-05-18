package arrayassignment_2;

import java.util.Scanner;

public class SpecificValue_Array {
	static void chcek(int arr[],int num) {
		int flag= 0;
		int i ;
		for(i =0;i<arr.length;i++) {
			if(arr[i] == num) {
				flag =1;
				break;
			
			}
			
		}
		if(flag == 1) {
		
			System.out.println("The give number is present at "+i+"  position");
		}
		else {
			System.out.println("The given number is not present.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int num = sc .nextInt();
		System.out.println("Enter array element :");
		
		int arr[]=new int[num];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number to check in array :");
		int num1 = sc.nextInt();
		
		chcek(arr,num1);
	}

}
