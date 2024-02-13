// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 36


// Q.1


public class Personne {
	private String nom;
	private static int nbPersonnes = 0;
	private static char lettre = 'A';
	
	public Personne() {
		nbPersonnes++;
		nom = "Individu" + lettre++;
	}
	
	public String toString() {
		return nom;
	}
	
	public static int getNbPersonnes() {
		return nbPersonnes;
	}
}
