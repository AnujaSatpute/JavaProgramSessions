package classandobject;

public class EmployeeSalaryDisplay {
	int salary;
	void setData(int salary) {
		 this.salary = salary;
	}
   
	public String toString()
	{
		return " "+salary;
	}
	double bonus(int salary , char rating) {
	    this.salary = salary;
		double newSalary =0;
		 if(rating == 'A') {
			  newSalary = salary + salary*0.2;
			 System.out.println("Salary hike is 20%  " + newSalary);
			 
		 }
		 else if(rating== 'B') {
			 newSalary = salary + salary*0.15;
			 System.out.println("Salary hike is 15% "+ newSalary);
			
		 }
		 else if(rating == 'C') {
			 newSalary = salary + salary*0.1;
			 System.out.println("Salary hike is 10% "+newSalary);
			 
		 }
		 else {
			 
			 System.out.println("No salary hike "+salary);
			 return salary;
		 }
		
		return newSalary;
		
	}
	
	void pfCalaculation(int salary) {
     
		
}
}
