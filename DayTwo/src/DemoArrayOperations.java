import java.util.Arrays;

public class DemoArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {123,55,11,45,67,34};
	/*	
		Arrays.fill(numbers,0);
		
	    for(int x:numbers) {
	    	System.out.print(x+"\t");
	    }
	    System.out.println();
	    
	*/
	    
	    Arrays.fill(numbers, 1, 3, 100);
	    
	    for(int x:numbers) {
	    	System.out.print(x+"\t");
	    }
	    System.out.println();
	    
	    int [] copy = Arrays.copyOf(numbers, 3);
	    
	    for(int x:copy) {
	    	System.out.print(x+"\t");
	    }
	    System.out.println();
	    
	    int [] copy1 = Arrays.copyOfRange(numbers, 1, 4);
	    
	    for(int x:copy1) {
	    	System.out.print(x+"\t");
	    }
	    System.out.println();
	    
	    
	    String [] names = {"a","b","c","d","e"};
	    String [] names1 = {"a","b","x","d","e"};
	    
	    if(Arrays.equals(names, names1))
	    	System.out.println("strings are same");
	    
	    Arrays.sort(numbers);
	    for(int x:numbers) {
	    	System.out.print(x+"\t");
	    }
	    System.out.println();
	    
	    System.out.println(Arrays.binarySearch(numbers, 1230));
	    
		
	}

}
