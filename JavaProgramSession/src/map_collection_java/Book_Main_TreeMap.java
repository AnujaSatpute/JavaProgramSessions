package map_collection_java;

import java.util.TreeMap;

public class Book_Main_TreeMap {
	void addData(TreeMap<Book,String> tm)
	{
		tm.put(new Book(101,"The India Story",450), "Bimal Jalal");
		tm.put(new Book(55,"A Place called home",220), "Prreti Shonoy");
		tm.put(new Book(69,"Lal Salam",300), "Smriti Irani");
		tm.put(new Book(7852,"Queen of fire",600), "Devika Rangachari");
		tm.put(new Book(9633,"Pinjar",450), "Amrita Pritam");
		tm.put(new Book(11111,"God of small things",450), "arundhati roy");
		tm.put(new Book(562,"The Glass palace",450), "Amitav Ghosh");
		tm.put(new Book(562,"The Glass palace",450), "Amitav Ghosh");
	}
 void display(TreeMap<Book,String> tm)
 {
	 System.out.println(tm);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		TreeMap<Book,String> tm = new TreeMap<>(new BookPriceComparator());
		Book_Main_TreeMap obj = new Book_Main_TreeMap();
		obj.addData(tm);
		obj.display(tm);
	}

}
