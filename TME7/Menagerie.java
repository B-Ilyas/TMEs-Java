// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public class Menagerie {
	public final Animal[] tab;
	private int nbAnimal = 0;
	
	public Menagerie(int nbAnimalmax) {
		tab = new Animal[nbAnimalmax];
	}
	
	public void ajouter(Animal a) {
		if (nbAnimal < tab.length) {
			tab[nbAnimal] = a;
			nbAnimal++;
		}
	}
	
	public String toString() {
		String s = "[";
		int i;
		for (i = 0; i < nbAnimal - 1; i++) {
			s += tab[i].toString() + ", ";
		}
		
		return s + tab[i] + "]";
	}
	
	public void midi() {
		for (Animal a : tab) {
			if (a != null) {
				a.crier();
			}
		}
	}
	
	public void vieillirTous() {
		for (Animal a : tab) {
			if (a != null) {
				a.vieillir();
			}
		}
	}
	
}
