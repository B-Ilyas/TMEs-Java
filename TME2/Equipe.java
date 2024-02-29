public class Equipe {
	public final String nom;
	private Coureur[] e = { new Coureur(), new Coureur(), new Coureur(), new Coureur() };
	
	public Equipe (String v) {
		nom = v;
	}
	
	public String toString(){
		String s = "";
		for (int i = 0; i < e.length ; i++){
			s+= e[i].toString();
		}
		return s;
	}
	
	public double tempsFinal(){
		double r = 0;
		for (int i = 0; i < e.length ; i++){
			r+= e[i].getTempsAu100();
		}
		return r;
	}
	
	public Equipe rencontrer (Equipe e){
		if (this.tempsFinal() < e.tempsFinal()){
			return this;
		} else {
			return e;
		}
	}
}
