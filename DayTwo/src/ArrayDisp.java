
public class ArrayDisp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {23,56,11,44,77,44,34,12,11};
		
		int count=0;
		while(count<array.length)
		{
			System.out.print(array[count]+"\t");
			count++;
		}
		System.out.println();
		
		for(int i = 0;i<array.length;i++)
		{
			System.out.print(array[i]+"\t");
			count++;
		}
		System.out.println();
		
		boolean flag = false;
		for(int x:array) {
			if (x == 44)
			{
				flag=true;
				break;
			}
		}
		
		if(flag)
			System.out.println("Element found");
		else
			System.out.println("Not found");
			

	}

}
