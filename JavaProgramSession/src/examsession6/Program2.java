package examsession6;

import java.util.Arrays;

//2.	Write a Java program to find total number of alphabets, digits or special character in a string.
public class Program2 {
      
	static void countString(String str) {
		   int scount,dcount,acount;
		   scount=dcount=acount=0;
		   char ch;
		   for(int i=0;i<str.length();i++) {
			    ch=str.charAt(i);
			   if(ch >= 'a' && ch<= 'z' || ch >= 'A' && ch <= 'Z' ) {
				   acount++;
				}
				else if(ch>= '0' && ch <= '9') {
					dcount++;
				}
				else {
					scount++;
				}
		   }
		   System.out.println("Character count : "+acount);
		   System.out.println("Numeric count : "+dcount);
		   System.out.println("Special character : "+scount);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s ="Java512$$isa#JavaSpeciallanguage10222@#4";
      countString(s);
     
	}

}
