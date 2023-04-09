package controlstatment;

public class WhileAnd_DoWhileProgram {

	void whileProgram() {
		int s = 1;
		while (s <= 5) {
			System.out.print(s + " ");
			s++;
		}
		System.out.println("Done");
	}

	void doWhileProgram() {
		int s = 6;
		do {
			System.out.print(s + " ");
			s++;
		} while (s <= 5);
		System.out.println("Done");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WhileAnd_DoWhileProgram obj = new WhileAnd_DoWhileProgram();
		obj.doWhileProgram();
		obj.whileProgram();
	}

}
