// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 46


public class Ellipse extends Figure2D {
	private double a, b;
	
	public Ellipse(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double surface() {
		return Math.PI * a * b;
	}
	
	public double perimetre() {
		return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
	}
	
	public String toString() {
		return String.format("Ellipse de longueur %.2f et %.2f, de surface %.2f et de perimetre %.2f", a, b, surface(), perimetre());
	}
	
}
