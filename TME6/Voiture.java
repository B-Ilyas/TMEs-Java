// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 42 (suite)

// Q.7

public class Voiture extends AMoteur {
	
	public Voiture(String marque, double capacite, double essence) {
		super(marque, capacite, essence);
	}
	
	public void transporter(int nbPers, int km) {
		if (super.enPanne()) {
			System.out.println("Voiture " + super.toString() + " n'a plus d'essence");
		} else {
			System.out.println("Voiture " + super.toString() + " transporte " + nbPers + " personnes sur " + km + " km");
		}
	}
}
