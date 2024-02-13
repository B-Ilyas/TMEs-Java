// Exercice 47

public abstract class Operation extends Expression {
	protected Expression a,b;
	
	public Operation(Expression a, Expression b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract double getVal();
}
