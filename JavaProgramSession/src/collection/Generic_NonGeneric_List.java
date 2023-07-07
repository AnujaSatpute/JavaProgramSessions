package collection;

import java.util.*;

public class Generic_NonGeneric_List {

	void nonGenericList() {
		ArrayList  al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("Anuja");
		al.add("ABc");
		al.add(23.56);
		al.add('a');
		al.add('e');
		al.add(new Student(100,"Anuja"));
		al.add(new Student(101,"Aishwarya"));
		for(Object obj : al) {
			if(obj.getClass().getSimpleName().equals("String"))
			{
				System.out.println(obj);
			}
		}
		
	}
	void generic()
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
		 
		 for(Integer al : a) {
			 if(al%2 == 0) {
				 System.out.println(al);
			 }
		 }
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic_NonGeneric_List gnl = new Generic_NonGeneric_List();
		gnl.nonGenericList();
		System.out.println("------------------");
		gnl.generic();
	}

}
