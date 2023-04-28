package inheritance;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank1 a1 = new AxisBank1();
		a1.showBank();
		a1.rateOfIntrest();
		a1.display();
		
		ICICIBank i = new ICICIBank();
		i.showBank();
		i.rateOfIntrest();
		i.display();
	}
}
