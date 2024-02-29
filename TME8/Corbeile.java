import java.util.ArrayList;

public class Corbeille{
	private ArrayList<Fruit> liste = new ArrayList<Fruit>();
	
	public Corbeille(int n){
		for (i = 0 ; i< n ; i++){
			double p = Math.random()*0.5;
			if (p< 0.5){
				liste.add(new Pomme());
			} else {
				liste.add(new Kiwi());
			}
		}
	}
	public void lister(){
		for (int i=0 ; i< liste.size(); i++){
			(liste.get(i)).afficher();
		}
	}
	
	public void meth(){
		for (Fruit f: liste){
			if (f instanceof Kiwi){
				f.methKiwi();
			}
		}
	}
	
}
