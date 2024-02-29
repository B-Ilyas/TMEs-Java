public class Generateur extends Module{
	
	
	public Generateur(String nom, int prod){
		super(nom, (int)(prod/2), prod);
	}
	public void produire(Station s){
		(s.getEnergie()).addEnergie(super.cout);
		System.out.println(super.toString());
	}

}
