public class Usine extends Module implements Alimentable{
	private int conso;
	private boolean actif;
	
	public Usine(String nom, int prod){
		super(nom, 10, prod);
		this.conso = 2*(super.prod);
		this.actif = false;
	}
	
	public void produire(Station s){
		if (actif){
			s.addMat(super.prod);
			System.out.println("["+ id + "]" + " Grande usine produit " + s.getMat() + "materiaux");
		} else {
			System.out.println("["+ id + "]" + " Grande usine inactive pas de production");
		}
	}
	
	public void alimenter(Station s){
		if (s.getEnergie() > 0){
			actif = true;
			s.addEnergie(conso*(-1));
			System.out.println("["+ id + "]" + " Usine alimentée");
		} else {
			actif = false;
		}
	}
	
	
}
