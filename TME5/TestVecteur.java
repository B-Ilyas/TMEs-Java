// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 37 (suite)


// Q.3

public class TestVecteur {
	public static void main (String[] args) {
		Vecteur v1 = new Vecteur(1.0, 2.0, 3.0);
		Vecteur v2 = new Vecteur(2.0, 1.0, 1.0);
		
		System.out.println("Avec méthode d'instance : " + v1.Somme(v2).toString());
		System.out.println("Avec méthode de classe : " + Vecteur.Somme2(v1, v2).toString());
	}
}
