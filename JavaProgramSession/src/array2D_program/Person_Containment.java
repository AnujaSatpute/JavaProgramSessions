package array2D_program;

public class Person_Containment {
	int id;
	String name ;
	IdProof_Continment ip;
	public Person_Containment(int id,String name,IdProof_Continment ip) {
		this.id =id;
		this.name = name;
		this.ip = ip;
	}
	public String toString() {
		return id+" "+name+" "+ip;
	}
}
