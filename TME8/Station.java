public class Station{
	private String nom;
	private int mat;
	private int energie;
	
	public Station(String nom){
		this.nom = nom;
		mat = 100;
		energie = 0;
	}
	
	public int getMat(){
		return mat;
	}
	
	public int getEnergie(){
		return energie;
	}
	
	public int addEnergie(int n){
		return energie + n;
	}
	
	public int addMat(int n){
		return mat + n;
	}
	
	public String toString(){
		return nom + " (" + energie + " kW, " + mat + " materiaux)";
	}
}
