package examsession10;

public class Movie {
 
	int id;
	String mname,producerName;
	int boxofficeCollection;
	
	Movie(int id, String mname,String producerName, int boxofficeCollection)
	{
		this.id=id;
		this.mname=mname;
		this.producerName=producerName;
		this.boxofficeCollection=boxofficeCollection;
	}
	public String toString()
	{
		return id+" "+mname+" "+producerName+" "+boxofficeCollection; 
	}
	
	
}
