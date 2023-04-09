package looping;

public class SeriesProgram {
	
	void squareSeries() {
	   int x=1;
		for(int i= 1; i<=7;i++) {
		  
		   System.out.print(x+" ");
		   x=x*2;
		  
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeriesProgram obj = new SeriesProgram();
		obj.squareSeries();
	}

}
