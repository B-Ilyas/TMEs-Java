// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 42 (suite)

// Q.2 & Q.6

public class AMoteur extends Vehicule {
	private double capacite;
	private double essence = 0;
	
	public AMoteur(String marque, double capacite, double essence) {
		super(marque);
		this.capacite = capacite;
		this.essence = essence;
	}
	
	public String toString() {
		return super.toString() + " de capacité de réservoir : " + capacite + " et de niveau d'essence : " + essence;
	}
	
	public void approvisionner(double nbLitres) {
		System.out.println(String.format("Le vehicule avait %.2f L d'essence", essence));
		if (nbLitres <= capacite - essence) {
			essence = essence + nbLitres;
		} else {
			essence = capacite;
		}
		System.out.println(String.format("Le vehicule a %.2f L d'essence", essence));
	}
	
	public boolean enPanne() {
		return (essence == 0);
	}
	
}
