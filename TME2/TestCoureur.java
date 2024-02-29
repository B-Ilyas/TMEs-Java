// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle


// Exercice 15 (suite)


// Q.3

public class TestCoureur {
	public static void main(String[] args) {
		Coureur c1 = new Coureur(99);
		Coureur c2 = new Coureur();
		Coureur c3 = new Coureur(405);
		Coureur c4 = new Coureur();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		
		c1.setPossedeTemoin(true);
		c1.courir();
		c1.passeTemoin(c2);
		c2.setPossedeTemoin(true);
		c2.courir();
		c2.passeTemoin(c3);
		c3.setPossedeTemoin(true);
		c3.courir();
		c3.passeTemoin(c4);
		c4.setPossedeTemoin(true);
		c4.courir();
		
		System.out.println(String.format("temps total = %.2f", c1.getTempsAu100() + c2.getTempsAu100() + c3.getTempsAu100() + c4.getTempsAu100()));
		
		Equipe e1 = new Equipe("Los Angeles");
		System.out.println(e1.toString());
		System.out.println(e1.tempsFinal());
		
		Equipe e2 = new Equipe("Los Angeles");
		System.out.println(e2.toString());
		System.out.println(e2.tempsFinal());
		
		System.out.println("L'equipe gagnante est :");
		System.out.println((e1.rencontrer(e2)).toString());
	}
}
