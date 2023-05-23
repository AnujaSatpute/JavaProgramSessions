package string_program;

import java.util.Arrays;

public class Anagram_String 
{

	static void anagram(String s1, String s2) 
	{
		//1 check length is equal or not then
		if (s1.length() == s2.length())
		{
			//2 length is equal then convert into array 
			char arr[] = s1.toCharArray();
			char arr1[] = s2.toCharArray();
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(arr1));
			//3 sort array
			Arrays.sort(arr);
			Arrays.sort(arr1);
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(arr1));
			int cnt=0;
			//4 check both character is same in array
            for(int i=0;i<arr.length;i++) 
            {
            	if(arr[i] == arr1[i])
            	      cnt++;
            }
            //5 check count of array is same or not
            if(cnt== arr.length) 
            {
            	System.out.println("It is anagaram");
            }
            else
            	System.out.println("Not a anagarm");
		}
		else
			System.out.println("Not a anagram");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1 = "race";
		String s2 = "care";
		anagram(s1, s2);
	}

}
