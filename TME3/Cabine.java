// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle


// Exercice 21

public class Cabine {
	private int volume;
	private String couleur;
	
	public Cabine(int volume, String couleur) {
		this.volume = volume;
		this.couleur = couleur;
	}
	
	public String toString() {
		return "Le volume du tracteur est " + volume + " m3 et de couleur " + couleur;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public Cabine (Cabine c) {
		volume = c.volume;
		couleur = c.couleur;
	}
	public Cabine clone(){
		return new Cabine(volume,couleur);
	}
}
