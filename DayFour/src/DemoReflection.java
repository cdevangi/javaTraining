import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

public class DemoReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= new String();
		
	
		try {
			Class class1 = Class.forName("java.lang.String");
			System.out.println(class1.getCanonicalName());
			
			Constructor [] constructors = class1.getConstructors();
			System.out.println("------------------------");
			for(Constructor c:constructors) {
				Type [] types = c.getParameterTypes();
				
				
				for (Type t:types) {
					System.out.print(t.getTypeName()+ ", " );
				}
				System.out.println();
			}
			
		}catch(ClassNotFoundException e) {
			
		}
			
		
	}

}
