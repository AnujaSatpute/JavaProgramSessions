package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Person_Main {

	void addData(ArrayList<Person> al)
	{
		al.add(new Person("Aishwarya",25,"9586224455","pune"));
		al.add(new Person("Rohini",30,"9586224655","Mumbai"));
		al.add(new Person("Priya",60,"9585624455","pune"));
		al.add(new Person("Komal",40,"9589224455","Mumbai"));
		al.add(new Person("seema",22,"9822453622","Nagpur"));
		al.add(new Person("reema",51,"9722623522","Mumbai"));
		
	}
	void display(ArrayList<Person> al)
	{
		System.out.println(al);
	}
	void mapData(ArrayList<Person> al)
	{
		HashMap<String ,Integer> hm =new HashMap<>();
		System.out.println(al);
		for(Person s :al)
		{
			if(hm.containsKey(s.city))
			{
				int x=hm.get(s.city);
				x=x+1;
				hm.put(s.city, x);
			}
			else
				hm.put(s.city, 1);
		}
		System.out.println(hm);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ArrayList<Person> al = new ArrayList<>();
		Person_Main obj = new Person_Main();
		obj.addData(al);
		obj.display(al);
		obj.mapData(al);
	}

}
