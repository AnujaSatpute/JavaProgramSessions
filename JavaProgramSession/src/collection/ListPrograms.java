package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListPrograms {

	void sum(ArrayList<Integer> al1) {
		 int sum=0;
		for(Integer i :al1) {
			sum=sum+i;
		}
		System.out.println("Addition : "+sum);
	}
	void frequency(ArrayList<Integer> al1)
	{
		int a=10;
		System.out.println("Frequency : "+Collections.frequency(al1, a));
	}
	void frequencyOfEachElements(ArrayList<Integer> al1)
	{
		Integer arr[] = new Integer[al1.size()];
		al1.toArray(arr);
		
		boolean b[] = new boolean[al1.size()];
		Arrays.fill(b, true);
	
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j])
				{
					count++;
					b[j]=false;
				}
			}
			if(b[i]==true)
			{
				System.out.println(arr[i]+" --> "+count);
			}
		}
	}
	void duplicate(ArrayList<Integer> al1)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println(al1);
		for(Integer a:al1)
		{
			if(!arr.contains(a)) {
				 arr.add(a);
			}
		}
		System.out.print(arr+" ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(5);
		li.add(60);
		li.add(22);
		li.add(55);
		li.add(10);
		li.add(55);
		li.add(23);
		li.add(22);
		li.add(10);
		li.add(55);
		li.add(4);
		li.add(2);
		li.add(22);
		System.out.println(li);
		System.out.println("\n-------------------------------------");
		ListPrograms obj = new ListPrograms();
		obj.sum(li);
		System.out.println("\n-------------------------------------");
		obj.frequency(li);
		System.out.println("\n-------------------------------------");
		obj.frequencyOfEachElements(li);
		System.out.println("\n-------------------------------------");
		obj.duplicate(li);
		
	}

}
