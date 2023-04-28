package containment;

public class Movie {
	private String m_name;
	private int price;
	private float rating;
	
	public void setM_Name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_Name() {
		return m_name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setRating(float rating) {
		this.rating = rating ;
	}
	public float getRating() {
		return rating;
	}
   
	void discount() {
		if(rating >= 8.0) {
			price = price -50;
			System.out.println("Price :"+price);
		}
	}
}
