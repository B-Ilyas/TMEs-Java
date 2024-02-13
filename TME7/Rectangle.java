// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 46


public class Rectangle extends Figure2D {
	private double lng, lrg;
	
	public Rectangle(double lng, double lrg) {
		this.lng = lng;
		this.lrg = lrg;
	}
	
	public double surface() {
		return lng * lrg;
	}
	
	public double perimetre() {
		return 2*(lng + lrg);
	}
	
	public String toString() {
		return String.format("Rectangle de longueur %.2f, de largeur %.2f, de surface %.2f et de perimetre %.2f", lng, lrg, surface(), perimetre());
	}
}
