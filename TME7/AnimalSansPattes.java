// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public abstract class AnimalSansPattes extends Animal {

	public AnimalSansPattes(String nom, int age) {
		super(nom, age);
	}
	
	public AnimalSansPattes(String nom) {
		super(nom);
	}
	
	public abstract void crier();
	
	public String toString() {
		return super.toString() + " sans pattes";
	}
}
