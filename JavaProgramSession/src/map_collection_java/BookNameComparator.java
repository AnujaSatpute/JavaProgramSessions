package map_collection_java;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.name.compareToIgnoreCase(o2.name);
	}

}
