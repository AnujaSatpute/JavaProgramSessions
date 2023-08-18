package com.mock1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoClass2 {
	ArrayList<Emp> arr = new ArrayList<>();
	public void adddata() {
		arr.add(new Emp(101,"Anuja",45000));
		 arr.add(new Emp(102,"Aishwarya",60000));
		 arr.add(new Emp(104,"Rohini",55000));
		 arr.add(new Emp(106,"Komal",45000));
		 arr.add(new Emp(107,"Pooja",25000));
		 
	}
	public void display()
	{
		System.out.println(arr);
		Collections.sort(arr, new SortItem());
		for(Emp e : arr)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoClass2 obj = new DemoClass2();
		obj.adddata();
		obj.display();
		 
		 
	}

}

class Emp
{
	 String name;
	 int id,salary;
	public Emp( int id, String name,int salary) {
		super();
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return id+" "+name+" "+salary;
	}
	 
}

class SortItem implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.salary-o2.salary;
	}
	
}