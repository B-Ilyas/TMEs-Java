public class Marchandise{
	private int id;
	private double poids;
	
	public Marchandise(double poids){
		this.poids = poids;
		id = (int)(Math.random() * 1001);
	}
	
	public double getPoids(){
		return poids;
	}
	
	public String toString(){
		return "Marchandise " + id + " de poids " + poids + " kilos";
	}
}
