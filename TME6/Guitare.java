// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 41 (suite)

// Q.3

public class Guitare extends Instrument {
	private String nom;
	private String type; // indique le type de la guitare
	
	public Guitare(int poids, int prix, String type) {
		super(poids, prix);
		this.type = type;
	}
	
	public String toString() {
		return "Guitare " + type + " " + super.toString();
	}
	
	public void jouer() {
		System.out.println("La guitare " + type + " joue");
	}
}
