public class Module extends Construction{
	protected int prod;
	
	public Module(String nom, int cout, int prod){
		super(nom,cout);
		this.prod = prod;
	}
	
	public abstract void produire();
	
	public String toString(){
		return super.toString() + " produit " + prod + " d'energie";
	}

}
