package controlstatment;

public class AdditionOfEachNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =45639 , add=0;
		while(num != 0) {
			int r = num %10;
			add= add+r;
			num = num /10;
		}
		
		System.out.println("Addition of each number is :"+ add);

	}

}
