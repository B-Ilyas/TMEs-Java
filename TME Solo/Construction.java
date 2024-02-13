public class Construction{
	private String nom;
	private int cout;
	public final int id;
	private int cpt = 0;
	
	public Construction(String nom , int cout){
		this.nom = nom;
		this.cout = cout;
		id = cpt;
		cpt++;
	}
	
	public int getCout(){
		return cout;
	}
	
	public String toString(){
		return "[" + id + "]" + " " + nom;
	}
	
}
