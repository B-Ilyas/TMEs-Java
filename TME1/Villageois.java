public class Villageois{
	private String nom;
	private double poids;
	private boolean malade;
	public Villageois (String nV){
		nom = nV;
		poids = (Math.random()*100)+50;
		malade = Math.random() < 0.2;
	}
	public String toString(){
		String m;
		if (malade == true){
			m = "oui";
		}else{
			m = "non";
		}
		String s = String.format( "Villageois : " + nom + ", poids : %.2f kg, malade : " +  m +", peut soulever %.1f kg", poids, poidsSouleve()) ;
		return s;
	}
	public String getNom(){
		return nom;
	}public double getPoids(){
		return poids;
	}public boolean getMalade(){
		return malade;
	}
	public double poidsSouleve(){
		if (malade == true){
			return poids/4;
		}else{
			return poids/3;
		}
	}
}
