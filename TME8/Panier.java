import java.util.ArrayList;

public class Panier extends ArrayList {
    private double poidsMax;
    private ArrayList<Object> p = new ArrayList<Object>();
    
    public Panier(double poidsMax) {
        this.poidsMax = poidsMax;
    }
    
    public double getPoids() {
        double poids = 0;
        
        for (int i = 0; i < p.size(); i++) {
            poids += ((Ramassable)(p.get(i))).getPoids();
        }
        
        return poids;
    }
    
     @Override public boolean add(Object o){
        if ((this.getPoids() + ((Ramassable)o).getPoids()) > poidsMax) {
            System.out.println(o.toString() + " n'est pas ajouté au panier");
            return false;
        }
       	p.add(o);
        System.out.println(((Ramassable)o).toString() + " est ajouté au panier");
        return true;
    }
    
    public int compterToxiques() {
        int c = 0;
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i) instanceof Toxique) {
                c++;
            }
        } 
        return c;
    }
    
    @Override public String toString() {
        return "Panier contenant " + p.size() + " objets, dont " + compterToxiques() + " toxiques (" + String.format("%.1f", getPoids()) + " kg sur " + String.format("%.1f", poidsMax) + " kg ) ";
    }
    
}
