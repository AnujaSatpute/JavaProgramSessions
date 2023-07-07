package map_collection_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TraversingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<>();
		 hm.put(101, "Anuja");
		 hm.put(23, "Aishwarya");
		 hm.put(1, "Rohini");
		 hm.put(10, "Teju");
		 hm.put(45, "komal");
		 hm.put(103, "reema");
		 hm.put(96, "Soniya");
		 hm.put(966, "renuka");
		 System.out.println("Hash Map value :"+"\n"+hm);
		 System.out.println("--------------------------");
		 
		 
		 System.out.println("Using key for traversing map : ");
		 for(Integer i : hm.keySet())
		 {
			 System.out.println(i);
		 }
		 System.out.println("--------------------------");
		 
		 
		 System.out.println("Using values for traversing map : ");
		 for(String str : hm.values())
		 {
			 System.out.println(str);
		 }
		 System.out.println("--------------------------");
		 
		 
		 System.out.println("Using Map.Entry<> for traversing map : ");
		 for(Map.Entry<Integer, String> me : hm.entrySet())
		 {
			 System.out.println(me.getKey()+" "+me.getValue());
		 }
		 System.out.println("--------------------------");
		 
		 
		 System.out.println("Using iterator for traversing map : ");
		 Set<Map.Entry<Integer, String>> st = hm.entrySet();
		 Iterator<Map.Entry<Integer, String>> itr = st.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		
	}

}
