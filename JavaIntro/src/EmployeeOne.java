
public class EmployeeOne {
	
	private int empId;
	private String empName;
	
	static int empCount;
	
	static {
		empCount=0;
	}
	
	public EmployeeOne()
	{
		empId=0;
		empName=null;
		empCount++;
	}
	
	public EmployeeOne(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
		empCount++;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	void displayEmployee() {
		System.out.println(empId+", "+empName);
	}
	
	static void showCount()
	{
		System.out.println("Count: "+empCount);
	}
	
	
	
	
	

}
