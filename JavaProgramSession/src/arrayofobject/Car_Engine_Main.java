package arrayofobject;

import java.util.Arrays;
import java.util.Scanner;

//using containment and array
public class Car_Engine_Main {
	Car_Containment cc[] = new Car_Containment[6];
	Scanner sc = new Scanner(System.in);

	void addData() {
		System.out.println("Enter car and engine information :");
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter engine info :");
			System.out.println("Enter engine company and power :");
			String company = sc.next();
			int power = sc.nextInt();
			System.out.println("Enter Car id ,name ,company,price :");
			int id = sc.nextInt();
			String na = sc.next();
			String comp = sc.next();
			long pr = sc.nextLong();

			Engine_Containment e1 = new Engine_Containment(company, power);
			Car_Containment c1 = new Car_Containment(id, na, comp, pr, e1);
			cc[i] = c1;
		}
	}

	void specificData() {
		for (Car_Containment c : cc) {
			if (c != null) {
				if (c.e.company.equalsIgnoreCase("fiat") && c.e.power == 1200) {
					System.out.println(c);
				}
			}
		}
	}

	void display() {
		System.out.println(Arrays.toString(cc));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_Engine_Main cm = new Car_Engine_Main();
		cm.addData();
		cm.specificData();
		cm.display();
	}

}
