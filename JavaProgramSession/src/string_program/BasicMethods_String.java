package string_program;

import java.util.Arrays;

public class BasicMethods_String {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Language";
		String s3 = "java";
		String s4 = "Java";
		String st1 = "Anuja";
		String st2 = "Anushree";
		String s = new String("Java");

		System.out.println("Comparing two Strings :" + (s1 == s));
		System.out.println("Merging two strings : " + (s1 + s2));
		System.out.println("Merging two strings 1:" + (s1.concat(s2)));
		System.out.println("Check equal contents of the string : " + s1.equals(s3));
		System.out.println("Equal ignorance case : " + s1.equalsIgnoreCase(s3));
		System.out.println("Compare to method : " + s1.compareTo(s3));
		System.out.println("Compare to ignore case" + st1.compareToIgnoreCase(st2));
		System.out.println("Contains Character in String : " + s2.contains("a"));
		// L a n g u a g e
		// 0 1 2 3 4 5 6 7
		System.out.println("Index of string :" + s2.indexOf('a'));
		System.out.println("Index of first occurance :" + s2.indexOf('a', 3));
		System.out.println("Index of last occurance :" + s2.lastIndexOf("g"));
		System.out.println("Index of last occurance : " + s2.lastIndexOf('g', 6));
		System.out.println("Length : " + s2.length());
		System.out.println("Char at : " + s2.charAt(3));
		System.out.println("Replace  : " + s2.replace("a", "A"));
		System.out.println("Replace first : " + s2.replaceFirst("a", "A"));
		System.out.println("Sub String : " + s2.substring(4));
		System.out.println("substring : " + s2.substring(1, 6));
		System.out.println("Upper case :" + s2.toUpperCase());
		System.out.println("Lower case : " + s2.toLowerCase());
		System.out.println("Start with :" + s2.startsWith("A"));
		System.out.println("Ends with : " + s2.endsWith("ge"));
		System.out.println("is empty :" + s2.isEmpty());
		char ch[] = s2.toCharArray();
		System.out.println(Arrays.toString(ch));
		String s5 = "Hello#World";
		String[] ss = s5.split("#");

		System.out.println("String split : " + Arrays.toString(ss));

	}

}
