// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 36 (suite)


// Q.1 & Q.4 & Q.5

public class TestProjet {
	public static void main (String[] args) {
		// Affiche le nb de personnes
		System.out.println(String.format("nbPersonnes = %d", Personne.getNbPersonnes()));
		
		// Crée deux personnes
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		
		// Affiche les personnes
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		// Affiche le nb de perssones
		System.out.println(String.format("nbPersonnes = %d", Personne.getNbPersonnes()));
		
		// Affiche le nb de trios
		System.out.println(String.format("nbTrio = %d", Trio.getNbTrio()));
		
		// Affiche le nb de projet
		System.out.println(String.format("nbProjet = %d", Projet.getNbProjet()));
		
		// Crée deux projets
		Projet prj1 = new Projet("P3X-774");
		Projet prj2 = new Projet("P3R-233");
		
		// Affiche les projets 
		System.out.println(prj1.toString());
		System.out.println(prj2.toString());
		
		// Affiche le nb de trios
		System.out.println(String.format("nbTrio = %d", Trio.getNbTrio()));
		
		// Affiche le nb de projets
		System.out.println(String.format("nbProjet = %d", Projet.getNbProjet()));
	}
}
