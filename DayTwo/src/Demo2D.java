
public class Demo2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix = new int[3][3];
		
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j] = i+j;
			}
		}
		
		for(int x[]:matrix) {
			for(int y:x) {
				System.out.print(y+"\t");
			}
			System.out.println();
		}
			
			
	}

}
