// Exercice 47

public class Valeur extends Expression {
	private double reelle;
	
	public Valeur(double reelle) {
		this.reelle = reelle;
	}
	
	public double getVal() {
		return reelle;
	}
	
	public void setVal(double v) {
		reelle = v;
	}
}
