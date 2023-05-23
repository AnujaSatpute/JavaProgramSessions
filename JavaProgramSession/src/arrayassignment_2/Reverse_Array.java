package arrayassignment_2;

import java.util.Arrays;

public class Reverse_Array 
{
	static void reverse(int arr[])
	{
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 50, 60, 30, 40 };
		reverse(arr);
	}

}
