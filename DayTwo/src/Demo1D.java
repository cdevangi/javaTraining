
public class Demo1D {
	
	public static int add(int [] nums)
	{
		return (nums[0]+nums[1]+nums[2]);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=2;
		
		int [] vals = new int [3];
		vals[0] = 5;
		vals[1] = 7;
		vals[2] = 1;
	
		
		System.out.println("zeroth element is: "+nums[0]);
		
		int sum = add(vals);
		System.out.println(sum);
		
		for(int i=0;i<3;i++)
		{
			System.out.println(nums[i]);
		}
		
		for(int x:nums)
		{
			System.out.println(x);
		}

	}

}
