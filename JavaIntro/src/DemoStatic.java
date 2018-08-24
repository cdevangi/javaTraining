
public class DemoStatic {
	
	private float age;
	private String name;
	
	private static int value;
	
	public DemoStatic()
	{
		age=12.3f;
		name="john";
		value++;
		
	}
	
	static {
		value=0;
	}

	public void display() {
		System.out.println(name+", "+age+", "+value);
	}
	
	public static void show() {
		System.out.println(value);
	}
	
	public static void main(String args[])
	{
		DemoStatic.show();
		DemoStatic ds1= new DemoStatic();
		DemoStatic ds2= new DemoStatic();
		DemoStatic ds3= new DemoStatic();
		
		ds2.show();
	}
}
