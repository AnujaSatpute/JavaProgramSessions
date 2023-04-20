package containment;

public class CarEngineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Engine e1 = new Engine(); e1.setPower(14000); e1.setName("Tata");
		 * 
		 * Engine e2 = new Engine(); e2.setPower(15000); e2.setName("Shell");
		 * 
		 * 
		 * Car c1 = new Car(); c1.setId(4563); c1.setName("AudiQ7");
		 * c1.setCompany("Audi"); c1.setPrice(8500000); c1.setEng(e1);
		 * 
		 * Car c2 = new Car(); c2.setId(4563); c2.setName("Creta");
		 * c2.setCompany("Hyundai"); c2.setPrice(200000); c2.setEng(e2);
		 * 
		 */
		/*
		 * System.out.println(c1); System.out.println(c2);
		 * System.out.println("----------------------");
		 * System.out.println(c1.getName()+"==> "+c1.getEng().getPower()+" "+c1.getEng()
		 * .getName());
		 * System.out.println(c2.getName()+"==> "+c2.getEng().getPower()+" "+c2.getEng()
		 * .getName());
		 */
		
		Engine e1 = new Engine(1500, "Tata" );
		Engine e2 = new Engine(1400,"Renults");
		
		Car c1 = new Car(1015,"audiQ7","Audi",8600000,e1);
		Car c2 = new Car(1546,"i20","Hyundai",456200,e2);
		
		System.out.println(c1);
		System.out.println(c2);

	}

}
