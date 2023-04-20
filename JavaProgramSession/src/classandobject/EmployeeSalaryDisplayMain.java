package classandobject;

public class EmployeeSalaryDisplayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		EmployeeSalaryDisplay obj = new EmployeeSalaryDisplay();
		
		obj.setData(45000);
		System.out.println(obj);
		obj.bonus(45000, 'A');
		
}
}
