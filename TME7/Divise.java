// Exercice 47

public class Divise extends Operation {
	private Expression e1, e2;
	
	public Divise (Expression e1, Expression e2){
		super(e1, e2);
	}
	
	public double getVal() {
		return e1.getVal() / e2.getVal();
	}
	
}
