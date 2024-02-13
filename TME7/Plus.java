// Exercice 47

public class Plus extends Operation {
	private Expression e1;
	private Expression e2;
	
	public Plus (Expression e1, Expression e2){
		super(e1, e2);
	}
	
	public double getVal(){
		return e1.getVal() + e2.getVal();
	}

	
}
