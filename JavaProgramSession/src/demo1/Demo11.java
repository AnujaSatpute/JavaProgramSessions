package demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 String s1="";
		 char ch[] = s.toCharArray();
		 System.out.println(Arrays.toString(ch));
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o')
			 {
				 ch[i]=Character.toUpperCase(ch[i]);
				 System.out.println(ch[i]);
				 
			 }
				s1=ch[i]+" ";
		 }
		 System.out.println(s1);
	}

}
