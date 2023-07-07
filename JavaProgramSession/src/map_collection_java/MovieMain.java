package map_collection_java;

import java.util.HashMap;
import java.util.Map;

public class MovieMain {

	void addData(HashMap<Integer, Movie> hm) {
		hm.put(100, new Movie(10000, "Bahubali1", new Producer("Karan johar", "9648236222")));
		hm.put(9871, new Movie(2000000, "RRR", new Producer("Karan Johar", "9878789")));
		hm.put(5672, new Movie(3000000, "Tiger Zinda hai", new Producer("Salman Khan", "987878912")));
		hm.put(1234, new Movie(1500000, "Kal ho na ho", new Producer("Karan Johar", "9878789")));
		hm.put(7654, new Movie(33300000, "Ek Tha Tiger", new Producer("Salman Khan", "9878789")));
		hm.put(6789, new Movie(5000000, "The Kerala Story", new Producer("Ajay devgan", "987565689")));
		hm.put(2453, new Movie(2000000, "Bhola", new Producer("Ajay Devgan", "987565689")));
		hm.put(2343, new Movie(6700000, "Yeh Jawani Hai diwani", new Producer("Karan Johar", "9878789")));
		hm.put(1254, new Movie(8990000, "URI", new Producer("Ria Sharma", "987565789")));
		hm.put(9123, new Movie(8900000, "Ved", new Producer("Ritesh deshmukh", "987563423")));
		hm.put(6589, new Movie(8900000, "Mauli", new Producer("Ritesh deshmukh", "987563423")));
	}

	void display(HashMap<Integer, Movie> hm) {
		// display data producer name ="karan jhoar"
		System.out.println(hm);
		for (Map.Entry<Integer, Movie> mp : hm.entrySet()) {
			if (mp.getValue().p.name.equalsIgnoreCase("Karan Johar"))
				System.out.println(mp.getValue().mname);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Movie> hm = new HashMap<>();
		MovieMain obj = new MovieMain();
		obj.addData(hm);
		obj.display(hm);
	}
	

}
