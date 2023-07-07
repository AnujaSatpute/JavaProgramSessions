package cmparatorcomparable;

import java.util.ArrayList;
import java.util.Collections;

public class CarMain {
	
	void addData(ArrayList<Car> cr)
	{
		cr.add(new Car(101,"Safari","Honda",2500000));
		cr.add(new Car(5,"Alto","Maruti",500000));
		cr.add(new Car(1,"Thar","Mahindra",2500000));
		cr.add(new Car(10,"i10","Hyundai",100000));
		cr.add(new Car(11,"Ertiga","Maruti",1200000));
		cr.add(new Car(100,"S-Cross","Maruti",1200000));
		cr.add(new Car(120,"Aura","Hyundai",800000));
		cr.add(new Car(50,"Tiago","Tata",1500000));
		cr.add(new Car(60,"Tigor","Tata",2500000));
		cr.add(new Car(8,"Sonet","Kia",900000));
		cr.add(new Car(1256,"Nexon","Tata",1000000));
		cr.add(new Car(320,"Ev6","kia",700000));
		cr.add(new Car(96,"Fortuner","Toyota",700000));
		cr.add(new Car(14,"Innova","Toyota",3200000));
		cr.add(new Car(78,"Amaze","Honda",600000));
		cr.add(new Car(852,"SkodaRapid","Skoda",1100000));
		cr.add(new Car(1000,"AudiQ7","Audi",5000000));
		
        
	}
	void display(ArrayList<Car> cr)
	{
		//Collections.sort(cr,new CarPriceComparator());
		Collections.sort(cr,new CarCompanyComparator());
		for(Car c : cr)
		{
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> cr = new ArrayList<>();
		CarMain obj = new CarMain();
		obj.addData(cr);
		obj.display(cr);
	}

}
