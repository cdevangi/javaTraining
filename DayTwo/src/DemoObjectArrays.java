
public class DemoObjectArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person [] persons = new Person[5]; 
		persons[0]=new Person();
		persons[1]=new Person(18, "abc");
				
	   for(Person x:persons) {
		   x.display();
	   }
	    
	    

	}

}
