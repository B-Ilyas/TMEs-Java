// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 42 (suite)

// Q.3

public class Velo extends SansMoteur {
	private int nbVites;
	
	public Velo(int nbVites, String marque) {
		super(marque);
		this.nbVites = nbVites;
	}
	
	public String toString() {
		return "Velo " + super.toString() + " " + nbVites + " vitesses";
	}
	
	public void transporter(String depart, String arrivee) {
		System.out.println("Velo " + super.toString() + " se déplace de " + depart + " a " + arrivee);
	}
}
