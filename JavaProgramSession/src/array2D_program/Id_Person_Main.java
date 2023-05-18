package array2D_program;

import java.util.Arrays;
import java.util.Scanner;

public class Id_Person_Main {
//	Person_Containment[] pc = new Person_Containment[6];
//	
//	void addData() {
//		pc[0] = new Person_Containment(101,"Anuja",new IdProof_Continment(14526322,"AddharCard"));
//		pc[1] = new Person_Containment(102,"Rohini",new IdProof_Continment(93664544,"PassPort"));
//		pc[2] = new Person_Containment(103,"Aishwarya",new IdProof_Continment(12685555,"PassPort"));
//		pc[3] = new Person_Containment(104,"Teju",new IdProof_Continment(78996555,"AddharCard"));
//		pc[4] = new Person_Containment(105,"Komal",new IdProof_Continment(745855,"PanCard"));
//		
//	}
//	void display() {
//		System.out.println(Arrays.toString(pc));
//		for(int i=0;i<pc.length;i++) {
//			if(pc[i] != null) {
//				if(pc[i].ip.name.equalsIgnoreCase("passport")) {
//					System.out.println(pc[i]+" ");
//				}
//			}
//		}
//	}
	Person_Containment p[] = new Person_Containment[10];
	Scanner sc = new Scanner(System.in);

	void info() {

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter idproof   id");
			int id = sc.nextInt();
			System.out.println("Document name ");
			String name = sc.next();

			IdProof_Continment ip = new IdProof_Continment(id, name);

			System.out.println(" Enter Person id ");
			int pid = sc.nextInt();
			System.out.println(" Enter Person Name ");
			String pname = sc.next();

			Person_Containment pp = new Person_Containment(pid, pname, ip);
			p[i] = pp;

		}

	}

	void display() {
		System.out.println(Arrays.toString(p));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Id_Person_Main obj = new Id_Person_Main();
//		obj.addData();
//		obj.display();

		// Person p []= new Person[10];
		Id_Person_Main ipm = new Id_Person_Main();
		ipm.info();
		ipm.display();

	}

}
