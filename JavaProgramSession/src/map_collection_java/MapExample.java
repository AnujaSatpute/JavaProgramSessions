package map_collection_java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {

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
		 System.out.println("-----------------------------\n");
		 LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
		 lhm.put(101, "Anuja");
		 lhm.put(23, "Aishwarya");
		 lhm.put(1, "Rohini");
		 lhm.put(10, "Teju");
		 lhm.put(45, "komal");
		 lhm.put(103, "reema");
		 lhm.put(96, "Soniya");
		 lhm.put(966, "renuka");
		 System.out.println("Linked Hash Map value :"+"\n"+lhm);
		 System.out.println("-----------------------------\n");
		 TreeMap<Integer,String> tm = new TreeMap<>();
		 tm.put(101, "Anuja");
		 tm.put(23, "Aishwarya");
		 tm.put(1, "Rohini");
		 tm.put(10, "Teju");
		 tm.put(45, "komal");
		 tm.put(103, "reema");
		 tm.put(96, "Soniya");
		 tm.put(966, "renuka");
		 System.out.println("Tree Map value :"+"\n"+tm);
		 
	}

}
