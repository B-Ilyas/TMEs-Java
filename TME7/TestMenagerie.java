// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public class TestMenagerie {
	public static void main(String[] args) {
	
		Menagerie m = new Menagerie(5);
		Boa b1 = new Boa("Bob");
		Vache v1 = new Vache("Marguerite", 5);
		Vache v2 = new Vache("Dell");
		Boa b2 = new Boa("PPTI", 35);
		
		m.ajouter(v1);
		m.ajouter(b1);
		m.ajouter(v2);
		m.ajouter(b2);
		
		for (Animal a : m.tab) {
			if (a != null) {
				System.out.println(a.toString());
			}
		}
		
		m.vieillirTous();
		m.midi();
		
		for (Animal a : m.tab) {
			if (a != null) {
				System.out.println(a.toString());
			}
		}
	}
}
