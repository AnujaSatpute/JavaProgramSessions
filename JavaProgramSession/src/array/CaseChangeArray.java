package array;

import java.util.Arrays;

public class CaseChangeArray {

	   void caseChange(char c[]) {
		   System.out.println("Orignal array :"+Arrays.toString(c));
		   for(int i=0;i<c.length;i++) {
			   if(c[i]>='A' && c[i]<='Z') {
				   c[i]=(char) (c[i]+32);
			   }
			   else if(c[i]>='a' && c[i]<='z') {
				   c[i]=(char) (c[i]-32);
			   }
		   }
		   System.out.println("Changed Array :"+Arrays.toString(c));
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch[]= {'a','b','A','E','W','q','y'};
		CaseChangeArray c1 = new CaseChangeArray();
		c1.caseChange(ch);

	}

}
