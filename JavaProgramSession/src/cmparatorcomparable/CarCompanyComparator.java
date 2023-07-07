package cmparatorcomparable;

import java.util.Comparator;

public class CarCompanyComparator implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return o1.company.compareToIgnoreCase(o2.company);
	}

}
