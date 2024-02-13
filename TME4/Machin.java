public class Machin {
	private String nom;
	private double valeur;
    
    public Machin(String nom) {
        this.nom = nom;
        valeur = (double)(Math.random()*100.);
    }
    
    public String toString() {
        return String.format("%s", nom);
    }

}
