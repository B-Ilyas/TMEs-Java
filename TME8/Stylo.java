public class Stylo{
	private String couleur;
	
	public Stylo(String couleur){
		this.couleur = couleur;
	}
	
	public String getCouleur(){
		return couleur;
	}
	
	public String toString(){
		return "Stylo " + couleur;
	}
}
