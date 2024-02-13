// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public abstract class Animal {
	protected String nom;
	protected int age;
	
	public Animal(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public Animal(String nom) {
		this(nom, 1);
	}
	
	public void vieillir() {
		age++;
	}
	
	public abstract void crier();
	
	public String toString() {
		return " " + nom + ", " + age + " ans";
	}

}
