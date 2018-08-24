import java.util.Scanner;

public class DemoString {
	
	public static void main(String args[]) {
		String name = "citi";
		//System.out.println(name);
		name = name.concat(",pune");
		//System.out.println(name);
		
		
		Scanner in = new Scanner(System.in);
		String var;
		
		System.out.println("Enter a string: ");
	    name = in.nextLine();
	    System.out.println("you entered: "+name);
	    
	    var=name.substring(1, 4);
	    System.out.println("substring from index 1 to 4: "+var);
	    
	    var=name.replace('l', 'o');
	    System.out.println("after replacing 'l' by 'o' : "+var);
		
	    var=name.toUpperCase();
	    System.out.println("converting to upper case: "+var);
	    
	    char a =name.charAt(2);
	    System.out.println("char at 2: "+a);
	    
	    boolean i = name.endsWith("i");
	    System.out.println("ends with 'i'?: "+i);
	    
	    in.close();
	}

}
