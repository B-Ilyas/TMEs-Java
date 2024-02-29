public class Fleur{
	private String nom;
	private String couleur;
	
	public Fleur(String name, String couleur){
		this.nom = name;
		this.couleur = couleur;
	}
	public Fleur(String nom){
		this(nom,"rouge");
	}
	public Fleur(){
		this("Marguerite");
		couleur = "jaune";
	}
	public String toString(){
		return "Je suis une fleur";
	}
	public String getNom(){
		return nom;
	}
}
