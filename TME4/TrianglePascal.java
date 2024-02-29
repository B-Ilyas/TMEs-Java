public class TrianglePascal{
	private int[][] mat;
	
	public TrianglePascal(int n){
		mat = new int[n][];
	}
	
	public int[][] remplirTriangle(){
		for (int i = 0; i < mat.length ; i++){
			mat[i] = new int[i+1];
			for (int j = 0 ; j < mat[i].length ; j++){
				if ((j == 0) || (j == i)){
					mat[i][j] = 1;
				}else{
					mat[i][j] = mat[i-1][j-1] + mat[i-1][j];
				}
			}
		}
		return mat;
	}
	
	public String toString(){
		String res = "";
		for(int[] d : mat){
			for(int i : d){
				res += i + "\t";
			}
			res += "\n";
		}
		return res;	
	}
}
