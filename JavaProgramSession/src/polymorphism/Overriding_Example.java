package polymorphism;

class Aeroplan {
	String name;
	int id;
	int size;

	Aeroplan(String name, int id, int size) {
		this.name = name;
		this.id = id;
		this.size = size;
	}

	void display() {
		System.out.println("Aeroplan name :" + name + "\n Aeroplan id :" + id + "\nSize :" + size);
	}
}

class Vistara extends Aeroplan {
	int vid;
	String type;

	Vistara(String name, int id, int size, int vid, String type) {
		super(name, id, size);
		this.vid = vid;
		this.type = type;
	}

	void display() {
		super.display();
		System.out.println("Vistara id :" + vid + "\nVistara type :" + type);
	}
}

class Spicejet extends Aeroplan {
	int sid;
	String features;

	Spicejet(String name, int id, int size, int sid, String features) {
		super(name, id, size);
		this.sid = sid;
		this.features = features;
	}

	void display() {
		super.display();
		System.out.println("Spicejet id :" + sid + "\nSpicejet features :" + features);
	}

}

public class Overriding_Example {

	public static void main(String[] args) {

		Aeroplan ar;
		ar = new Vistara("Anuja", 14562, 32, 101, "International");
		ar.display();
		System.out.println("-------------------------------------");
		ar = new Spicejet("ABc", 142, 40, 100, "FreeFood");

		ar.display();

	}

}
