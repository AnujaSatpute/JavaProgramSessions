package patternandfor;

public class ReverserCharacterPattern {
	
	void rverserPattern() {
		
	/*for(char i ='e'; i>='a';i--) {
			for(char j='e';j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		 int r= 5;
		for(int i= 1;i<= r;i++) {
			for(int j= r ;j>=i ;j--) {
				System.out.print((char)(j+96));
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverserCharacterPattern obj = new ReverserCharacterPattern();
		obj.rverserPattern();
	}

}
