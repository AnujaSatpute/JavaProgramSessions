package controlstatment;

public class CharacterOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = '7';

		if (ch >= 'a' && ch <= 'z') {
			System.out.println(" given value is Alphabate");
		} else
			System.out.println("Given value is not alphabate");

		if (ch >= '0' && ch <= '9') {
			System.out.println("Given value is number");
		} else
			System.out.println("Given value is not a number");
	}

}
