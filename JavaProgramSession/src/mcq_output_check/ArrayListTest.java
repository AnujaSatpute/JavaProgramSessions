package mcq_output_check;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		List<String> arrayList = new  ArrayList<String>();
		arrayList.add("a");
		arrayList.add("b");
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			arrayList.add("c");
		}
		
	}

}
