// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle


// Exercice 15


// Q.1 & Q.2

public class Coureur {
	private int numDossard;
	private double tempsAu100;
	private boolean possedeTemoin;
	
	public Coureur(int numDossard) {
		this.numDossard = numDossard;
		tempsAu100 = (int)(Math.random()*4) + 12;
		possedeTemoin = false;
	}
	
	public Coureur() {
		this((int)(Math.random()*999) + 1);
	}
	
	public int getNumDossard() {
		return numDossard;
	}
	
	public double getTempsAu100() {
		return tempsAu100;
	}
	
	public boolean getPossedeTemoin() {
		return possedeTemoin;
	}
	
	public void setPossedeTemoin(boolean possedeTemoin) {
		this.possedeTemoin = possedeTemoin;
	}
	
	public String toString() {
		return String.format("Coureur %d, tempsAu100 : %.1f au 100m, possedeTemoin : %B", numDossard, tempsAu100, possedeTemoin);
	}
	
	public void passeTemoin(Coureur c) {
		 possedeTemoin = false;
		 c.possedeTemoin = true;
		 System.out.println("moi, coureur " + numDossard + ", je passe le témoin au coureur " + c.numDossard);
	}
	
	public void courir() {
		System.out.println("je suis le coureur " + numDossard + " et je cours");
	}
}
