import com.city.domain.Animal;
import com.city.domain.Cat;
import com.city.domain.Dog;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a;
		a=new Cat(3);
		a.sound();
		
		a=new Dog(7);
		a.sound();

	}

}
