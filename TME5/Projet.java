// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 36 (suite)


// Q.3

public class Projet {
	private String nom;
	private Trio t;
	private static int nbProjet = 0;
	
	public Projet(String nom) {
		this.nom = nom;
		t = new Trio();
		nbProjet++;
	}
	
	public String toString() {
		return "Projet " + nom + " " + t.toString(); 
	}
	
	public static int getNbProjet() {
		return nbProjet;
	}
}
