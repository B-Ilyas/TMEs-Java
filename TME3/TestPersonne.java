// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle

public class TestPersonne {
	public static void main (String[] args) {
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		Personne p3 = new Personne();
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		p1.epouser(p2);
		System.out.println("Mariage de " + p1.toString() + " et de " + p2.toString() + " : ");
		System.out.println("Les personnes apres mariage : ");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println("Essai de mariage de " + p1.toString() + " et de " + p3.toString() + " : "); 
		p1.epouser(p3);
		
		System.out.println("Divorce de " + p1.toString() + " et de " + p2.toString() + " : ");
		p1.divorcer();
		p2.divorcer();
		System.out.println("Les personnes apres divorce : ");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
