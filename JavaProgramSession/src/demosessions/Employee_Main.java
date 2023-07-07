package demosessions;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("anuja");
		e1.setDept("HR");
		e1.setSalary(45000);
		
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("rohini");
		e2.setDept("sales");
		e2.setSalary(60000);

		
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getDept()+" "+e1.getSalary());
		System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getDept()+" "+e2.getSalary());

	}

}
