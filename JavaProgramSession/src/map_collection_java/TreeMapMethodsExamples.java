package map_collection_java;

import java.util.TreeMap;

public class TreeMapMethodsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 
		 System.out.println(tm.headMap(5));
         System.out.println(tm.tailMap(5));
         System.out.println(tm.higherEntry(102));
	}

}
