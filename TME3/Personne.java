// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle

public class Personne {
	private String nom;
	private Personne conjoint;
	
	public Personne() {
		this("pers");
		nom = nom + tirageLettre() + tirageLettre() + tirageLettre();
		this.conjoint = null;
	}
	
	public Personne(String nom) {
		this.nom = nom;
		this.conjoint = null;
	}
	
	public Personne(Personne p) {
		this(p.nom);
		this.conjoint = p;
	}
	
	private char tirageLettre() {
		return (char) (Math.random()*26 + 'A');
	}
	
	public String toString() {
		if (conjoint == null){
			return nom + ", celib";
		} else {
			return nom + ", marié(e)";
		}
	}
	
	void epouser(Personne p) {
		if ((p.conjoint != null) || (this.conjoint != null)) {
			System.out.println("Ce mariage est impossible !");
		} else {
			this.conjoint = new Personne(p);
			p.conjoint = this.conjoint;
		}
	}
	
	void divorcer() {
		if (conjoint != null) {
			conjoint = null;
		}
	}
}

