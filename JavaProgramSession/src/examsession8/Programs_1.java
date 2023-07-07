package examsession8;

import java.util.ArrayList;

/*1.	Assume you have Arraylist<String> al = new ArrayList<String>();
al.add("Sun");
al.add("Mon");
al.add("Sat");
al.add("Sun ");
al.add("Mon ");
al.add("Sat ");
al.add("Sun ");
al.add("Sat ");
al.add("Sun ");
al.add("Mon ");
Write a code to remove duplicate elements from above list. 
Final arraylist should contain ( Sun, Mon, Sat);*/

public class Programs_1 {
	void addData(ArrayList<String> al )
	{
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
	}
	
	void display(ArrayList<String> al)
	{
		System.out.println(al);
		ArrayList<String> str = new ArrayList<>();
		for(String s : al)
		{
			if(!str.contains(s))
			{
				str.add(s);
				
			}
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> al = new ArrayList<>();
		 Programs_1 obj = new Programs_1();
		 obj.addData(al);
		 obj.display(al);
	}

}
