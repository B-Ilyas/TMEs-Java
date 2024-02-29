public class Champignon implements Ramassable{
	private String nom;
	private double poids;
	
	public Champignon (String nom){
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
