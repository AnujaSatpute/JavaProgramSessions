package corejavaclass;

public class TemparatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 double f,c=22;//celeius to fahrenheit conversion
		 f=c*(9/5)+32;
		 System.out.println("celeius to fahrenheit conversion :"+f);
		 
		 //fahrenheit to Celeius conversion
		 double f1=36.5,c1;
		 c1=(f1-32)*5/9;
		 System.out.println("fahrenheit to Celeius conversion :"+c1);
		 
	}

}
