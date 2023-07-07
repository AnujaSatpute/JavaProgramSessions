package collection;

import java.util.ArrayList;

public class ArrayListMethods {

	 public static void main(String[] args)
	 {
		 ArrayList<Integer> a = new ArrayList<>();
		 a.add(10);
		 a.add(236);
		 a.add(9);
		 a.add(50);
		 a.add(36);
		 a.add(85);
		 a.add(120);
		 a.add(30);
		 a.add(10);
		 a.add(120);
		 System.out.println(a);
//		 for(Integer i :a) 
//		 {
//			 System.out.print(i+" ");
//		 }
		  a.add(3, 500);
		System.out.println("Adding elements : "+a );
		System.out.println("Contains value or not : "+a.contains(236));
		System.out.println("Index of : "+a.indexOf(36));
		System.out.println("Last index of : "+a.lastIndexOf(10));
		System.out.println("Is empty or not : "+a.isEmpty());
		/*
		 * a.clear(); System.out.println(a);
		 */
		a.remove(3);
		System.out.println("After remove() : "+a);
		System.out.println("Size of arraylist  : "+a.size());
		
		a.set(3, 5000);
		System.out.println("After set the element : "+a);
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1000);
		a1.add(20000);
		a1.add(5000);
		a1.add(3000);
		a1.add(10);
		
		System.out.println(a1);
		a.addAll(a1);
		System.out.println("Add all elements of list 1 and list 2 : "+a);
		
		System.out.println("Contains all : "+a.containsAll(a1));
		
		a.removeAll(a1);
		System.out.println("Remove all elements form a1 "+a);
		
		ArrayList<Integer> a2 =new ArrayList<>();
		a2.add(1000);
		a2.add(20000);
		a2.add(5000);
		a2.add(3000);
		a2.add(10);
		
		System.out.println("Equals or not : "+a1.equals(a2));
	 }
}
