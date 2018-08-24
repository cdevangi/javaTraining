
public class Employee {
	
	private int empID;
	private double empSalary;
	private String empName;
	private String companyName;
	
	Employee()
	{
		empID=10;
		empSalary=1000d;
		empName="devangi";
	    companyName="citi";
	}
	
	Employee(int empID,double empSalary,String empName)
	{
		this();
		this.empID=empID;
		this.empName=empName;
		this.empSalary=empSalary;
				
	}

	void display()
	{
		System.out.println(empID+", "+empName+", "+companyName);
	}
	
	public static void main(String args[])
	{
		Employee e= new Employee(81417,20000d,"devangi");
		e.display();
	}
}
