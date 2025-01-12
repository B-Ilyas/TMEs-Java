// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle


// Exercice 14


// Q.1

public class AdresseWeb {
	private String protocole, domaine, chemin;
	
	public AdresseWeb(String protocole, String domaine, String chemin) {
		this.protocole = protocole;
		this.domaine = domaine;
		this.chemin = chemin;
	}
	
	public AdresseWeb(String domaine, String chemin) {
		this("http", domaine, chemin);
	}
	
	public AdresseWeb(String domaine) {
		this(domaine, " ");
	}
	
	public String toString() {
		return (protocole + "://www." + domaine + chemin);
	}
}
