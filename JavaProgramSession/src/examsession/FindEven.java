package examsession;

/*
 * 4.	WAP to print even numbers from 121 to 229 using while loop. 
 */
import java.util.Scanner;

public class FindEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number :");
		int s = sc.nextInt();
		System.out.println("Enter the end number :");
		int e = sc.nextInt();
		
	   while(s <= e) {
		   if(s%2 == 0) {
			   System.out.print(s+" ");
			   
		   }
		   s++;
	   }
	  
	}

}
