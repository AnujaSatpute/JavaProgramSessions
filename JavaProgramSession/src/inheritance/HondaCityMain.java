package inheritance;

public class HondaCityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HondaCity h1 = new HondaCity();
		 h1.setColor("White");
		 h1.setMilegae(25);
		 h1.setPrice(450000);
		 h1.wheelNo();
		 h1.airbags();
		 h1.dashboard();
		 h1.display();
	System.out.println(	 h1.getMilegae()+"\n"+
		 h1.getColor()+"\n"+
		 h1.getPrice());
	}

}
