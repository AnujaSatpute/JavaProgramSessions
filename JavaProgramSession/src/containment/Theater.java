package containment;

public class Theater {
	
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
		this.tname = tname ;
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
