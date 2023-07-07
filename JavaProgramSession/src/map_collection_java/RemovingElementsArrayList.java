package map_collection_java;

import java.util.ArrayList;

public class RemovingElementsArrayList {

	void removeOccurance(int num)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(5);
		al.add(60);
		al.add(22);
		al.add(55);
		al.add(10);
		al.add(55);
		al.add(23);
		al.add(22);
		al.add(10);
		al.add(55);
		al.add(4);
		al.add(2);
		al.add(22);
		System.out.println(al);
		
		for(Integer i : al) {
			if(i%2 == 0)
			{
				al.remove(num);
			}
		}
	}
	void duplicate()
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(5);
		al.add(60);
		al.add(22);
		al.add(55);
		al.add(10);
		al.add(55);
		al.add(23);
		al.add(22);
		al.add(10);
		al.add(55);
		al.add(4);
		al.add(2);
		al.add(22);
		System.out.println(al);
		
		 ArrayList<Integer> al1 = new ArrayList<>();
		 
		 for(Integer i :al)
		 {
			 if(!al1.contains(i))
			 {
				 al1.add(i);
			 }
		 }
		 System.out.println(al1);
	}
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemovingElementsArrayList obj = new RemovingElementsArrayList();
		obj.duplicate();
	}

}
