package patternandfor;

public class PatternPrograms {
	
	void starPattern1() {
		int r = 5;
		for (int i = 1; i < r; i++) {
			
			for (int j = r-i; j>1; j--) {//To handle number of spaces 
				System.out.print(" ");
			}
			for(int j =1 ;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternPrograms obj = new PatternPrograms();
		obj.starPattern1();
		
	}

}
