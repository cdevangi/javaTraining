import com.pojo.Person;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(21,"abc");
		Person p2 = new Person(21,"abc");
		
		if(p1.equals(p2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
	}

}
