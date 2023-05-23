package string_program;

import java.util.Arrays;

public class OperationsOnStringArray {
	static String s = "Java is a good programming language";

	static void wordCount() {
		String str[] = s.split(" ");
		System.out.println(Arrays.toString(str));
		System.out.println("Total no of words : " + str.length);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i] + " --> " + str[i].length());
		}
	}

	static void reverseOrder() {
		String str[] = s.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			{
				System.out.print(str[i] + " ");
			}
		}
	}

	static void oddIndexToUpper() {
		String str[] = s.split(" ");
		String s1 = "";
		System.out.println(Arrays.toString(str));
		for (int i = 0; i < str.length; i++) {
			if (i % 2 == 1) {
				str[i] = str[i].toUpperCase();
				s1 = s1 + str[i] + " ";
			} else {
				s1 = s1 + str[i] + " ";
			}
		}
		System.out.println(s1);
	}

	static void sortArray() {
		String str[] = s.split(" ");
		System.out.println(Arrays.toString(str));
		for (int i = 0; i < str.length; i++) 
		{
			for (int j = 0; j < str.length - 1; j++)
			{
				int x = str[j].compareTo(str[j + 1]);
				if (x > 0)
				{
					String temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wordCount();
		System.out.println("\n-----------------------------\n");
		reverseOrder();
		System.out.println("\n--------------------------------------\n");
		oddIndexToUpper();
		System.out.println("\n---------------------------\n");
		sortArray();
	}
}
