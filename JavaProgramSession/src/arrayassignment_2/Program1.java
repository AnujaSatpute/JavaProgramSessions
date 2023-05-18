package arrayassignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len, p,ele;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of an array:");
        len = sc.nextInt();
        int arr[] = new int[len+1];
        System.out.println("Enter "+len+" elements:");
        for(int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the element which you want to insert:");
        ele = sc.nextInt();
        arr[len] = ele;
        
        System.out.print("After inserting : ");
        for(int i = 0; i <len; i++)
        {
            System.out.print(arr[i]+",");
        }
      
        System.out.print("\n"+arr[len]);
	}

}
