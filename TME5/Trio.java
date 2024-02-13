// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 36 (suite)


// Q.2

public class Trio {
	private int numero;
	private static int nbTrio = 0;
	private Personne[] tab;
	
	public Trio() {
		tab = new Personne[]{new Personne(), new Personne(), new Personne()};
		nbTrio++;
		numero = nbTrio;
	}
	
	public String toString() {
		return "Trio" + numero + " : " + tab[0].toString() + " " + tab[1].toString() + " " + tab[2].toString();
	}
	
	public static int getNbTrio() {
		return nbTrio;
	}
}
