// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 41


// Q.2

public class Instrument {
	private int poids, prix;
	
	public Instrument(int poids, int prix) {
		this.poids = poids;
		this.prix = prix;
	}
	
	public String toString() {
		return "poids : " + poids + " kg, prix : " + prix + " euros";
	}
	
	public void jouer() {
		System.out.println("L'instrument joue");
	}
}
