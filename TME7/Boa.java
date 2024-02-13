// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public class Boa extends AnimalSansPattes {

	public Boa(String nom, int age) {
		super(nom, age);
	}
	
	public Boa(String nom) {
		super(nom);
	}
	
	public void crier() {
		System.out.println("Sssss");
	}
	
	public String toString() {
		return "Boa" + super.toString();
	}
}
