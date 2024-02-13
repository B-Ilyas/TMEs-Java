// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public abstract class AnimalAPattes extends Animal {
	public final int nbPattes;
	
	public AnimalAPattes(String nom, int age, int nbPattes) {
		super(nom, age);
		this.nbPattes = nbPattes;
	}
	
	public AnimalAPattes(String nom, int nbPattes) {
		super(nom);
		this.nbPattes = nbPattes;
	}
	
	public abstract void crier();
	
	public String toString() {
		return super.toString() + ", a " + nbPattes + " pattes";
	}

}
