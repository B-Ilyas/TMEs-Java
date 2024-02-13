// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle


// Exercice 21

public class Roue {
	private int diam;
	
	public Roue(int diam) {
		this.diam = diam;
	}
	
	public Roue() {
		this.diam = 60;
	}
	
	public String toString() {
		return "La roue est de diamètre " + diam + " cm";
	}
	public int getDiam(){
		return diam;
	}
	public Roue(Roue r){
		diam = r.diam;
	}
	public Roue clone(){
		return new Roue(diam);
	}
}
