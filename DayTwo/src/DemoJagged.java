
public class DemoJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arrays = new int[3][];
		
		arrays[0] = new int[4];
		arrays[1] = new int[2];
		arrays[2] = new int[3];
		
	for(int i=0;i<arrays.length;i++)
	{
		for(int j=0;j<arrays[i].length;j++)
			arrays[i][j] = i+j;
	}
	
	for(int [] r:arrays) {
		for(int c:r) {
			System.out.print(c+"\t");
		}
		System.out.println();
	}

	}

}
