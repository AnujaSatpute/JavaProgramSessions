package map_collection_java;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapMethods {

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
		 System.out.println("Contains key : "+hm.containsKey(23) );
		 System.out.println("Conatins Value : "+hm.containsValue("Anuja"));
		 System.out.println("Replace : "+hm.replace(101, "Aadya"));
		 System.out.println(hm);
		 System.out.println("get default : "+hm.getOrDefault(101, "Anuja"));
			/*
			 * hm.clear(); 
			 * System.out.println(hm);
			 */
		 LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
		 lhm.put(10000, "Shweta");
		 lhm.put(20000, "Shreya");
		 lhm.put(30000, "Tejal");
		 

		 LinkedHashMap<Integer,String> lhm1 = new LinkedHashMap<>();
		 lhm1.put(10000, "Shweta");
		 lhm1.put(20000, "Shreya");
		 lhm1.put(30000, "Tejal");
		 
		 hm.putAll(lhm);
		 System.out.println("Put all method "+hm);
		 
			/*
			 * lhm.putAll(hm); 
			 * System.out.println(lhm);
			 */
		 
		 System.out.println("Equals : "+lhm.equals(lhm1));
		 hm.remove(101);
		 System.out.println(hm);
		 System.out.println(hm.get(103));//value specific key
		 
		

	}

}
