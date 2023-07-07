package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class FailFastIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li = new ArrayList<>();
		
		  li.add(10); li.add(5); li.add(60); li.add(22); li.add(55); li.add(10);
		  li.add(55); li.add(23); li.add(22); li.add(10); li.add(55); li.add(4);
		  li.add(2); li.add(22); System.out.println(li);
		 
		
		  for(Integer i : li)
		   {
		      if(i==10) { 
		      li.add(1000); 
		      }
		    }
		 
		/*
		 * int sum=0; Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter how many: "); int num = sc.nextInt(); for(int
		 * i=0;i<num;i++) { li.add(sc.nextInt()); } System.out.println(li); for(Integer
		 * i : li) { sum=sum+i; } System.out.println(sum);
		 */
		
		
	}

}
