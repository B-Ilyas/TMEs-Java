import java.util.ArrayList;

public class Trousse{
	private ArrayList<Stylo> t = new ArrayList<Stylo>();
	
	public void addStylo(Stylo s){
		t.add(s);
	}
	
	public int compter(String coul){
		int c = 0;
		for(int i =0 ; i < t.size() ; i++){
			if ((t.get(i)).getCouleur() == coul){
				c++;
			}
		}
		return c;
	}
	public String toString(){
		String res = "";
		for(Stylo s : t){
			res+= s.toString() + "\n";
		}
		return res; 
	}
}
