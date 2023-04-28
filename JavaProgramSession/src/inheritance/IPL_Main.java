package inheritance;

/*3 Create class IPLTeam with method play. Create child classes of IPLTeam
called as CSK, RCB. In main, call play from child class objects.*/

class IPL {
	void play() {
		System.out.println("IPL Teams Captain are :");
	}
}

class CSK extends IPL {
	void play() {
		super.play();
		System.out.println("CSK Captain is MS.Dhoni");
	}
}

class RCB extends IPL {
	void play() {
		super.play();
		System.out.println("RCB Captain is Virat Kohali");
	}
}

public class IPL_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSK c = new CSK();
		c.play();

		RCB r = new RCB();
		r.play();
	}

}
