// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 46


public class Cercle extends Ellipse {
	private double r;
	
	public Cercle(int r) {
		super(r, r);
		this.r = r;
	}
	
	public double surface() {
		return super.surface();
	}
	
	public double perimetre() {
		return super.perimetre();
	}
	
	public String toString() {
		return String.format("Cercle de rayon %.2f de surface %.2f et de perimetre %.2f", r, surface(), perimetre());
	}
}

