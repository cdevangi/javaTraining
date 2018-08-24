import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList<String>();
		l.add("abc");
		l.add("xyz");
		l.add("lmn");
		l.add("def");
		l.add("pqr");
		l.add("xyz");
		
		System.out.println(l);
		
		l.add(3, "pqr");
		
		System.out.println(l);
		
		
		l.add("123");
		System.out.println(l);
		
		System.out.println(l.size());
		
		if(l.contains(123))
			System.out.println("found");
		else
			System.out.println("not found");
		
		System.out.println("at 2: "+l.get(2));
		
		System.out.println(l.remove(1)+" removed");
		System.out.println(l);
		
		System.out.println("removal of 'pqr': "+l.remove("pqr"));
		System.out.println(l);
		
		System.out.println("removal of '123': "+l.remove("123"));
		System.out.println(l);
		
		
		Iterator<String> i = l.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+"\t");
		}
	
		

	}

}
