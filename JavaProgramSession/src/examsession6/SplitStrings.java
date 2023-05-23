package examsession6;

import java.util.Arrays;

//1.	WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class SplitStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1 = "HELLO$WORLD";
       String s=" ";
       char str[] =s1.toCharArray();
     System.out.println(s1);
    //   System.out.println(Arrays.toString(str));
      for(int i=0;i<str.length;i++) {
    	  if(str[i]=='$') {
    		  str[i]=' ';
   
    	  }
    	  if(str[i] != '$') {
    		  s=s+str[i];
    	  }
      }
      System.out.println(s);
      
	}

}
