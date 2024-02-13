// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle

public class Tracteur{
	private Roue r1 , r2 , r3 , r4 ;
	private Cabine c;
	
	public Tracteur(Roue r1 , Roue r2 , Roue r3 , Roue r4 , Cabine c){
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.r4 = r4;
		this.c = c;
	}
	
	public String toString(){
		return c.toString() + "\n" + r1.toString() + "\n" + r2.toString() + "\n" + r3.toString() + "\n" + r4.toString();
	}
	
	public void peindre(String couleur){
		c.setCouleur(couleur);
	}
	
	public Tracteur (Tracteur t){
		r1 = new Roue(t.r1);
		r2 = new Roue(t.r2);
		r3 = new Roue(t.r3);
		r4 = new Roue(t.r4);
		c =  new Cabine(t.c);
	}
	public Tracteur clone(){
		return new Tracteur(r1.clone(),r2.clone(),r3.clone(),r4.clone(),c.clone());
	}
	
}
