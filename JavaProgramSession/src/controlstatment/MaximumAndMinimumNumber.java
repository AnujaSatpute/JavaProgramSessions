package controlstatment;

public class MaximumAndMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =145639 , max=num%10,min=num%10;
		while(num != 0) {
			int r = num %10;
			if(r< max) {
				max=r;
			}
			if(r>min) {
				min=r;
			}
			num = num /10;
		}
		
		System.out.println("Minimum of  number is :"+ min);
		System.out.println("Maximum of  number is :"+ max);

	}

}
