package collection;

import java.util.*;
public class TraversingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Character> ch = new ArrayList<>();
         ch.add('a');
         ch.add('b');
         ch.add('e');
         ch.add('i');
         ch.add('j');
         ch.add('b');
         ch.add('e');
         ch.add('m');
         ch.add('n');
         ch.add('l');
         ch.add('a');
         ch.add('b');
         System.out.println("character array : "+"\n"+ch);
         System.out.println("-----------------------------------");
//         ArrayList<Character> ch1 = new ArrayList<>(ch);
//         System.out.println(ch1);
         
         
			
			  System.out.println("Array traversing using normal for loop : "); 
			  for(int i=0;i<ch.size();i++) 
			  {
				  System.out.print(ch.get(i)+" ");
				  }
			 
			  System.out.println("\n-----------------------------------");
         
         System.out.println("Iteration for collection....");
         Iterator<Character> itr = ch.iterator();
         while(itr.hasNext()) {
        	 System.out.print(itr.next()+" ");  //forward direction
        	// itr.remove(),itr.next();
         }
         System.out.println("\n-----------------------------------");
         System.out.println("ListInterator for list only  forward direction ......");
         ListIterator<Character> itr1 = ch.listIterator();
         while(itr1.hasNext()) {
        	 System.out.print(itr1.next()+" ");
        	 
         }
         
         System.out.println("\n-----------------------------------");
         System.out.println("ListInterator for list only  forward direction ......");
         ListIterator<Character> itr2 = ch.listIterator(ch.size());
         while(itr2.hasPrevious()) {
        	 System.out.print(itr2.previous()+" ");
         }
	}

}
