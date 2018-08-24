import java.util.ArrayList;

public class DemoArrayList {
	
	public static void main(String [] args)
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(15);
		list.add(15);
		list.add(23);
		
		System.out.println(list.size());
		System.out.println(list);
		
		list.add(2, 2000);
		System.out.println(list);
		
		list.remove(new Integer(15));
		
		System.out.println(list);
	}
	

}
