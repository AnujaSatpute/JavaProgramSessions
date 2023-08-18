package com.mock1;

public class DemoClass {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		 int n = 12345;
		 int rem =0;
		 int last=0;
		 rem = n%10;
		 last = rem;
	     while(n >0)
	     {
	    	rem=n%10;
	    	
	    	n = n/10;
	       
	    	
	     }
	     System.out.println(last+" "+rem);
	     int sum=last+rem;
	     System.out.println(sum);
	     
	}
	

}
