// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public class Vache extends AnimalAPattes {
	private double quantite;
	
	public Vache(String nom, int age) {
		super(nom, age, 4);
		quantite = (Math.random()*25) + 5;
	}
	
	public Vache(String nom) {
		super(nom, 4);
		quantite = (Math.random()*25) + 5;
	}
	
	public void crier() {
		System.out.println("Meuuh");
	}
	
	public String toString() {
		return String.format("Vache %s et contient %.2f L de lait", super.toString(), quantite);
	}
}
