public class ChampignonToxique implements Ramassable,Toxique{
	private String nom;
	private double poids;
	
	public ChampignonToxique (String nom){
		this.nom = nom;
		poids = (Math.random() * 3);
	}
	
	public double getPoids(){
		return poids;
	}
	
	public String toString(){
		return nom + " " +poids + "kg";
	}
}
