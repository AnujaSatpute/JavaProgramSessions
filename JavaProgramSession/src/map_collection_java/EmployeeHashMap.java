package map_collection_java;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {
	
	public void addData(HashMap<Integer,Employee> hm)
	{
		
		hm.put(100, new Employee("Anuja","HR",70000));
		hm.put(10, new Employee("Reema","Finace",90000));
		hm.put(121, new Employee("Anu","HR",65000));
		hm.put(5, new Employee("Aishwarya","Techincal",80000));
		hm.put(309, new Employee("Rohini","Finace",79000));
		hm.put(20, new Employee("komal","Techincal",50000));
		hm.put(70, new Employee("pooja","Finace",60000));
		hm.put(11, new Employee("yash","HR",75000));
		hm.put(66, new Employee("akshay","Techincal",88000));
		hm.put(456, new Employee("vaishu","sales",55000));
		hm.put(130, new Employee("kiran","sales",90000));
		hm.put(78, new Employee("geeta","Marketing",65000));
		hm.put(1, new Employee("poonam","HR",70000));
		
		}

		/*
		 * public void display(HashMap<Integer,Employee> hm) 
		 * { 
		 *    System.out.println(hm);
           }
		 */
	
	  public void display(HashMap<Integer,Employee> hm)
	  {
		  //employee working in hr department
		  System.out.println(hm);
		  System.out.println("--------------------------");
		  for(Map.Entry<Integer,Employee> map : hm.entrySet())
		  {
//			  if(map.getValue().dept.equalsIgnoreCase("hr"))
//				  System.out.println(map.getKey()+" "+map.getValue());
			  
			  float sal =map.getValue().salary;
			  if(map.getValue().dept.equalsIgnoreCase("hr"))
			  {
				  sal = sal+sal*0.15f;
				  map.getValue().salary=sal;
				  System.out.println(map);
			  }
		  }
		  System.out.println("--------------------------");
		  System.out.println(hm);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Employee> hm = new HashMap<>();
		EmployeeHashMap obj = new EmployeeHashMap();
		obj.addData(hm);
		obj.display(hm);
	}

}
