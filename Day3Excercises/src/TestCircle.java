import com.pojo.Circle;
import com.pojo.Shape;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s = new Circle(10,"Circle");
		System.out.println("Area is: "+s.area());
		s.description();

	}

}
