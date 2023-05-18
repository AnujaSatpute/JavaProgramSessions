package arrayofobject;

import java.util.Arrays;
import java.util.Scanner;

public class Student_Crud_Main {
	Student_Crud stud[] = new Student_Crud[15];
	Scanner sc = new Scanner(System.in);
	
	void addData() {
		/*
		 * stud[0]= new Student_Crud(101,"Anuja","anuja@gmail.com",96583214,66);
		 * stud[1]= new
		 * Student_Crud(102,"aishwarya","aishwarya1@gmail.com",85965525,70); stud[2]=
		 * new Student_Crud(103,"rohini","rohini12@gmail.com",63259544,45); stud[3]= new
		 * Student_Crud(104,"teju","t@gmail.com",9683214,93); stud[4]= new
		 * Student_Crud(105,"pooja","pooja111@gmail.com",96983214,60); stud[5]= new
		 * Student_Crud(106,"vinna","vi@gmail.com",36583214,55); stud[6]= new
		 * Student_Crud(107,"sima","ss@gmail.com",57583214,88); stud[7]= new
		 * Student_Crud(108,"komal","komal@gmail.com",558583214,71); stud[8]= new
		 * Student_Crud(109,"ashwini","a@gmail.com",96583214,66);
		 */
		for(int i =0;i<5;i++) {
			System.out.println("Enter id,name ,email,contact and marks of student");
            int id = sc.nextInt();
            String name =sc.next();
            String email = sc.next();
            int contact = sc.nextInt();
            int marks = sc.nextInt();
            
            Student_Crud s1 = new Student_Crud(id,name,email,contact,marks);
            stud[i] = s1;
            
		}
		System.out.println(Arrays.toString(stud));
	}
	void updateData() {
		System.out.println("Enter the id :");
		int id = sc.nextInt();
		System.out.println("Enter email which is updated :");
		sc.nextLine();
		String email = sc.nextLine();
		for(Student_Crud s1 : stud) {
			if(s1 != null) {
				if(s1.id == id) {
					s1.email = email;
				}
			}
		}
	}
	void deleteData() {
		System.out.println("Enter id which is deleted :");
		int id =sc.nextInt();
		for(int i=0;i<stud.length;i++) {
			if(stud[i] != null) {
				if(stud[i].id == id) {
					stud[i] =null;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(stud));
	}
	
	void display() {
		System.out.println(Arrays.toString(stud));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Crud_Main obj = new Student_Crud_Main();
		obj.addData();
		obj.updateData();
		obj.display();
		obj.deleteData();
	}

}
