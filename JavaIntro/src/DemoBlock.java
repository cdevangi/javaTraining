
public class DemoBlock {

	public DemoBlock()
	{
		System.out.println("Constructor invoked");
	}
	
	{
		System.out.println("non static block invoked");
	}
	
	static {
		System.out.println("Static block invoked");
	}
	
	public void display()
	{
		System.out.println("display invoked");
	}
	
	public static void show()
	{
		System.out.println("static show invoked");
	}
	
	public static void main(String args[])
	{
		DemoBlock.show();
		DemoBlock db = new DemoBlock();
		DemoBlock db1 = new DemoBlock();
		db.display();
	}
}
