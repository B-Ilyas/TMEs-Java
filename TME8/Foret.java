import java.util.ArrayList;

public class Foret {
	private Object[][] terrain;
	
	public Foret(int t) {
		terrain = new Object[t][t];
	}
	
	public boolean placer(Object obj) {
		int x = (int)(Math.random() * terrain.length);
		int y = (int)(Math.random() * terrain.length);
        
		if (terrain[x][y] != null) {
			return false;
            
		} else {
			terrain[x][y] = obj;
			return true;
		}
	}
    
    ArrayList<Object> ramasserTout() {
        // Ramasse tous les objets ramassables et les retournent dans une liste
        ArrayList<Object> l = new ArrayList<Object>();
        
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (terrain[i][j] instanceof Ramassable) {
                    l.add(terrain[i][j]);
                    terrain[i][j] = "  ";
                }
                
            }
        }
        
        return l;
    }
    
    public void ramasser(Panier p) {
        // Ramasse tous les objets ramassables à la limite du poidsMax du panier p
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if ((terrain[i][j] instanceof Ramassable) && p.add(terrain[i][j])) {
                    terrain[i][j] = "  ";
                }
                
            }
        }
    }
	
	public String toString() {
		String res = "";
		for (Object[] t: terrain) {
			res += "|";
			for (Object o: t) {
				if (o != null) {
					res += o.toString().charAt(0) + " ";
				} else {
					res += "  ";
				}
			}
			res += "|\n";
		}
		
		return res + "\n";
	}
}
