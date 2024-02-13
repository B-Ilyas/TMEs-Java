// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 42 (suite)

// Q.7

public class Camion extends AMoteur {
	
	public Camion(String marque, double capacite, double essence) {
		super(marque, capacite, essence);
	}
	
	public void transporter(String materiau, int km) {
		if (super.enPanne()) {
			System.out.println("Camion " + super.toString() + " n'a plus d'essence");
		} else {
			System.out.println("Camion " + super.toString() + " transporte " + materiau +  " sur " + km + " km");
		}
	}
}
