package map_collection_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExamples_1 {
	void display()
	{
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
		 
		 for(String s : hm.values())
		 {
			 if(s.startsWith("R") || s.startsWith("r"))
				 System.out.println(s);
		 }
		 System.out.println("--------------------------");
		 
		 for(Integer i :hm.keySet())
		 {
			 if(hm.get(i).startsWith("r")||hm.get(i).startsWith("R"))
				 System.out.println(i+" "+hm.get(i));
		 }
		 
		 System.out.println("-------------------------------");
		 for(Map.Entry<Integer, String> mp :hm.entrySet())
		 {
			 if(mp.getValue().startsWith("R") || mp.getValue().startsWith("r"))
				 System.out.println(mp.getKey()+" "+mp.getValue());
		 }
	}
    
	void arrayListToMap() {
	
		ArrayList<String> al = new ArrayList<>();
		al.add("Sunday");
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wensday");
		al.add("Sunday");
		al.add("Monday");
		al.add("Saturday");
		al.add("Wensday");
		al.add("Sunday");
		al.add("Friday");
		al.add("Tuesday");
		al.add("Monday");
		
		HashMap<String ,Integer> hm =new HashMap<>();
		System.out.println(al);
		for(String s :al)
		{
			if(hm.containsKey(s))
			{
				int x=hm.get(s);
				x=x+1;
				hm.put(s, x);
			}
			else
				hm.put(s, 1);
		}
		System.out.println(hm);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapExamples_1 obj = new MapExamples_1();
		obj.display();
		System.out.println("-------------------------");
		obj.arrayListToMap();
	}

}
