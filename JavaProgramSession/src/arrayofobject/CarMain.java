package arrayofobject;

import java.util.Scanner;

public class CarMain {
	Car c1[] = new Car[10];

	void addData() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter id ,name ,company,and price of car :");
			int id = sc.nextInt();
			String name = sc.next();
			String company = sc.next();
			int price = sc.nextInt();

			Car c2 = new Car(id, name, company, price);
			c1[i] = c2;
		}
	}

	void display() {
		for (Car c3 : c1) {
			if (c3 != null) {
				if (c3.price > 1000000) {
					System.out.println(c3.id + " " + c3.name + " " + c3.company + " " + c3.price);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarMain m1 = new CarMain();
		m1.addData();
		m1.display();
	}

}
