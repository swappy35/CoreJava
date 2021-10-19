package assignments;

public class arrayAddition {

	public static void main(String[] args) {
		int[][] a = {{15,25,35},{45,55,65}};
		int[][] b = {{12,22,32},{55,25,85}};
		
		int c[][] = new int[2][3];
		
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				c[i][j] = a[i][j]+b[i][j];
				System.out.println(c[i][j]);
			}
		}		

	}

}
