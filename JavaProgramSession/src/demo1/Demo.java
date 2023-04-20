package demo1;

public class Demo {
 public static void main(String args[]) {
	 int r= 3;
	 for(int i =1;i<=r ;i++) {
		 
		 for(int j=r-1 ;j>=i;j--) {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=i;k++) {
			 System.out.print(k+" ");
		 }
		for(int m=i-1;m>=1;m--) {
			System.out.print(m);
		}
	     
		 System.out.println();
	 }
 }
 }
