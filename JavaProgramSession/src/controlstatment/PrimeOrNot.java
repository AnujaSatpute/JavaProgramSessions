package controlstatment;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1,count=0,i=2;
		while(num>i) {
			if(num%i == 0) {
				count++;
				break;
			}
			i++;
		}
		if(count == 0)
			System.out.println(num+" Number is prime number");
		else
			System.out.println(num+" Number is not a prime number");
	}

}
