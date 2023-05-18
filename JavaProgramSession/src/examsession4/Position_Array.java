package examsession4;
//Q2)	WAP to insert an element in a specific position into an array.

import java.util.Scanner;

public class Position_Array {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len, p,e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of an array:");
        len = sc.nextInt();
        int arr[] = new int[len+1];
        System.out.println("Enter "+len+" all the elements:");
        for(int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position where you want to insert an element:");
        p = sc.nextInt();
        System.out.print("Enter the element which you want to insert:");
        e = sc.nextInt();
        for(int i = len-1; i >= (p-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[p-1] = e;
        System.out.print("After inserting : ");
        for(int i = 0; i <=len; i++)
        {
            System.out.print(arr[i]+",");
        }
	}

}
