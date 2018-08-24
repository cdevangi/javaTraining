import com.pojo.Employee;
import com.pojo.Person;

public class DemoPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person e = new Employee();
		((Employee)e).display(10); //Down casting
	}

}
