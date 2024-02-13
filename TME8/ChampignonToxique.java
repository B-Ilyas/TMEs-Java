public class ChampignonToxique extends Champignon implements Toxique {
    private String nom;
    private double poids;
    
    public ChampignonToxique(String nom) {
        super(nom);
    }
    
    public double getPoids() {
        return super.getPoids();
    }
    
    public String toString() {
        return super.toString();
    }
}
