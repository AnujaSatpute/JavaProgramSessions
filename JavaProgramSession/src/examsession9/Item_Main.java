package examsession9;

import java.util.ArrayList;
import java.util.HashMap;

import collection.Person;

public class Item_Main {

	void addData(ArrayList<Item> al)
	{
		
		al.add(new Item(112,"ParleG", 20, 10));
		al.add(new Item(113,"GoodDay",40,30));
		al.add(new Item(112,"ParleG", 20, 5));
		al.add(new Item(113,"GoodDay",40,10));

	}
	void display(ArrayList<Item> al)
	{
		System.out.println(al);
	}
	void mapData(ArrayList<Item> al)
	{
		HashMap<String ,Integer> hm =new HashMap<>();
		System.out.println(al);
		int sum=0;
		for(Item s :al)
		{
			if(hm.containsKey(s.name))
			{
				int x=hm.get(s.name);
				x=x+1;
				int x1=hm.get(s.qty);
				x1=x1+sum;
				//sum+=x1;
				hm.put(s.name, sum);
			}
			else
				hm.put(s.name, 1);
		}
		System.out.println(hm);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item> al = new ArrayList<>();
		Item_Main i = new Item_Main();
		i.addData(al);
		i.display(al);
		i.mapData(al);
		
	}

}
