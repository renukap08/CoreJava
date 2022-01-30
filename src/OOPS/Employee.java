package OOPS;

public class Employee {
    
    public String Name;
    public int EmployeeId;
    public static int Salary = 1000;
    public static String CompanyName = "Cognizant";
    
    @SuppressWarnings("static-access")
	public Employee(String Name,int EmployeeId, int Salary) {
        
        this.Name = Name;
        this.EmployeeId = EmployeeId;
        this.Salary = Salary;        
    }
    
    public Employee(String Name,int EmployeeId) {
        
        this.Name = Name;
        this.EmployeeId = EmployeeId;
        
    }
    
    public void PrintName() {
        
        System.out.println("Name of employee is " + this.Name);
    }
    
    public void PrintSalary() {
        
        System.out.println("Salary of employee is " + Employee.Salary);
    }
    
    public void ChangeCompanyName() {
        
        Employee.CompanyName = "Cognizant Technology";
        
        System.out.println(this.Name + " has changed to " + Employee.CompanyName);
        
    }
    
    
}
