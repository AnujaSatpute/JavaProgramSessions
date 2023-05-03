package javaassignment;

/*Create class Theatre(id,name,Movie) with private acess modifier and create setter and 
 * getter.create another class
Movie(m_id,m_name,rating)  with private acess modifier and create setter and getter and 
display the details*/

class Movie {
	private String m_name;
	private int mid;
	private float rating;

	public void setM_Name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_Name() {
		return m_name;
	}

	public void setId(int mid) {
		this.mid = mid;
	}

	public int getId() {
		return mid;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public float getRating() {
		return rating;
	}
}

class Theater {
	private int tid;
	private String tname;
	Movie m;

	public void setTId(int tid) {
		this.tid = tid;
	}

	public int getTId() {
		return tid;
	}

	public void setTName(String tname) {
		this.tname = tname;
	}

	public String getTName() {
		return tname;
	}

	public void setM(Movie m) {
		this.m = m;
	}

	public Movie getM() {
		return m;
	}
}

public class Movie_Theter_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Theater t1 = new Theater();
		System.out.println("Theter info :");
		t1.setTId(111);
		t1.setTName("Vishal");

		Movie m1 = new Movie();
		t1.setM(m1);
		t1.getM().setId(101);
		t1.getM().setM_Name("ddlj");
		t1.getM().setRating(4.5f);
		System.out.println(
				"Theater id: " + t1.getTId() + "\nTheater name :" + t1.getTName() + "\nMovie id :" + t1.getM().getId()
						+ "\nMovie name :" + t1.getM().getM_Name() + "\nMovie Rating :" + t1.getM().getRating());
	}

}
