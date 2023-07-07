package examsession8;
//4.	Traverse linked list in reverse direction using listIterator.

import java.util.LinkedList;
import java.util.ListIterator;

public class Program_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		
		 ListIterator<Integer> itr2 = ll.listIterator(ll.size());
         while(itr2.hasPrevious()) {
        	 System.out.print(itr2.previous()+" ");
	}

}
}
