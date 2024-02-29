import java.util.ArrayList;

public class Foret{
	private Object[][] terrain;
	
	public Foret (int t){
		terrain = new Object[t][t];
	}
	
	public boolean placer (Object obj){
		int x = (int)(Math.random()*terrain.length);
		int y = (int)(Math.random()*terrain.length);
		if (terrain[x][y] != null) {
			return false;
		} else {
			terrain[x][y] = obj;
			return true;
		}
	}
	
	public ArrayList<Object> ramasserTout(){
		ArrayList<Object> res = new ArrayList<Object>();
		for (int i =0 ; i< terrain.length ; i++){
			for (int j =0 ; j< terrain[i].length ; j++){
				if (terrain[i][j] instanceof Ramassable){
					res.add(terrain[i][j]);
					terrain[i][j] = null;
				}
			} 
		}
		return res;
	}
	
	public void ramasser(Panier p) {
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if ((terrain[i][j] instanceof Ramassable) && p.add(terrain[i][j])) {
                    terrain[i][j] = null;
                }
                
            }
        }
    }
	
	
	public String toString(){
		String res = "";
		for (Object[] t: terrain){
			res += "| ";
			for(Object o: t){
				if (o != null) {
					res += (o.toString()).charAt(0) + "\t";
				} else {
					res += "\t";
				}
			}
			res += "|\n";
		}
		
		return res + "\n";
	}
}
