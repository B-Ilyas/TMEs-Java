

public class Pile {
	private Machin[] tab;
	private int nbElements;
	
	public Pile(int n) {
		tab = new Machin[n];
	} 
	
	public boolean estVide() {
		if (nbElements == 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean estPleine() {
		if (nbElements == tab.length) {
			return true;
		}
		
		return false;
	}
	
	public void empiler(Machin m) {
		if (!estPleine()) {
			tab[nbElements] = m;
			nbElements++;
		} else {
            System.out.println(String.format("Mince, plus de place pour %s", m.toString()));
        }
	}
	
	public Machin depiler() {
		Machin tmp = null;
		if (!estVide()) {
			nbElements--;
			tmp = tab[nbElements];
			tab[nbElements] = null;
        }
		return tmp;
	}
	
    public String toString() {
        if (estVide()) {
            return "La pile est déjà vide !";
        }
        
        String s = "";
        for (int i = nbElements - 1; i >= 0; i--) {
            s += tab[i].toString() + "\n";
        }
        
        return s;
    }

}
