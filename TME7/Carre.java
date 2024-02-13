// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 46


public class Carre extends Rectangle {
	private double cote;
	
	public Carre(double cote) {
		super(cote, cote);
		this.cote = cote;
	}
	
	public double surface() {
		return super.surface();
	}
	
	public double perimetre() {
		return super.perimetre();
	}
	
	public String toString() {
		return String.format("Carre de cote %.2f, de surface %.2f et de perimetre %.2f", cote, surface(), perimetre());
	}
}
