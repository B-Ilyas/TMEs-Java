// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 41 (suite)

// Q.3

public class Piano extends Instrument {
	private String nom;
	private int nbTouches;
	
	public Piano(int poids, int prix, int nbTouches) {
		super(poids, prix);
		this.nbTouches = nbTouches;
	}
	
	public String toString() {
		return "Piano " + nbTouches + " touches " + super.toString();
	}
	
	public void jouer() {
		System.out.println("Le piano à " + nbTouches + " touches joue");
	}
}
