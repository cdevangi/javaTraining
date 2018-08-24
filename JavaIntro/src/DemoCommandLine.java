public class DemoCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("no of args: "+args.length);

		int sum=0;
		for(String x:args)
		{
			System.out.println(x);
			sum+=Integer.parseInt(x);
		}
		System.out.println("sum: "+sum);
		
		Integer i=new Integer(10);
		
		int val = i.intValue();  //unboxing
		val=i;      
		
		
		i=5;


	}

}
