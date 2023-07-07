package map_collection_java;
//Using hash Map
import java.util.HashMap;

public class Book_Main {
	void addData(HashMap<Book,String> hm)
	{
		hm.put(new Book(101,"The India Story",450), "Bimal Jalal");
		hm.put(new Book(55,"A Place called home",220), "Prreti Shonoy");
		hm.put(new Book(69,"Lal Salam",300), "Smriti Irani");
		hm.put(new Book(7852,"Queen of fire",600), "Devika Rangachari");
		hm.put(new Book(9633,"Pinjar",450), "Amrita Pritam");
		hm.put(new Book(11111,"God of small things",450), "arundhati roy");
		hm.put(new Book(562,"The Glass palace",450), "Amitav Ghosh");
		hm.put(new Book(562,"The Glass palace",450), "Amitav Ghosh");
	}
 void display(HashMap<Book,String> hm)
 {
	 System.out.println(hm);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Book,String> hm = new HashMap<>();
        Book_Main obj = new Book_Main();
        obj.addData(hm);
        obj.display(hm);
	}

}
