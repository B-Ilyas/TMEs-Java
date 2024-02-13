// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 42

// Q.2

public class Vehicule {
	protected final int numId;
	private static int compteur = 1;
	private String marque;
	private double distance = 0;
	 
	public Vehicule(String marque) {
		numId = compteur;
		compteur++;
		this.marque = marque;
	}
	
	public String toString() {
		return numId + " de marque " + marque;
	}
	
	public void rouler(double distance) {
		this.distance = this.distance + distance;
		System.out.println(this.toString() + " a roulé " + this.distance + " km");
	}
	
}


// Q.10 On peut factoriser la méthode factoriser au niveau de véhicule , il faudra passer par l'utilisation du super dans les classes filles
