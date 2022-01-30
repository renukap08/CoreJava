package OOPS;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee emp1 = new Employee();
		
		emp1.Name = "Renu";
		emp1.EmployeeId = 12345;
		emp1.Salary = 1000;
		
		Employee emp2 = new Employee();
		
		emp2.Name = "Bharath";
		emp2.EmployeeId = 67890;
		emp2.Salary = 1200; */

		//Employee emp1 = new Employee("Renu",12345,1000);
		//Employee emp2 = new Employee("Bharath",67890,1200);

		//emp1.PrintName();
		//emp2.PrintName();

		Employee emp3 = new Employee("Darshu",2468);
		Employee.ChangeCompanyName();

		//Employee emp3 = new Employee();
		

		Person per1 = new Person();

		ChildClass child = new ChildClass();

		ChildClass child1 = new ChildClass("Darshu",6,"Student");

		MethodOverLoadingExample obj = new MethodOverLoadingExample();
		obj.sum(4, 6);
		obj.sum(4, 6, 7);

		// BankExample bank = new BankExample();	-- can not create object of abstract class

		ABCBank bank1 = new ABCBank();
		bank1.Creditcard();
		bank1.Welcome();

		EncapsulationExample obj10 = new EncapsulationExample();

		obj10.setName("Renu");
		System.out.println(obj10.getName());

	}

}