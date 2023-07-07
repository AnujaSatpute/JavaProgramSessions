package map_collection_java;

import java.util.HashMap;

public class Student_Main {

	void addData(HashMap<Student,Integer> hm)
	{
		hm.put(new Student(101,"Anuja","Computer"), 90);
		hm.put(new Student(10,"aishwarya","science"), 50);
		hm.put(new Student(1,"rohini","arts"), 62);
		hm.put(new Student(85,"komal","Computer"), 85);
		hm.put(new Student(963,"pooja","commerce"), 75);
		hm.put(new Student(892,"teju","Computer"), 77);
		hm.put(new Student(7,"muskan","Computer"), 65);
		hm.put(new Student(7,"muskan","it"), 65);
		
	}
	
	void display(HashMap<Student,Integer> hm)
	{
		System.out.println(hm);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Student,Integer> hm =new HashMap<>();
       Student_Main obj = new Student_Main();
       obj.addData(hm);
       obj.display(hm);
	}

}
