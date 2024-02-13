// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle


// Exercice 21


public class TestTracteur {
	public static void main(String[] args) {
		Roue r1 = new Roue();
		Roue r2 = new Roue();
		Roue r3 = new Roue(120);
		Roue r4 = new Roue(120);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		System.out.println(r4.toString());
		
		Cabine c1 = new Cabine(3, "bleue");
		System.out.println(c1.toString());
		
		Tracteur t1 = new Tracteur(r1,r2,r3,r4,c1);
		System.out.println(t1.toString());
		
		t1.peindre("Rouge");
		System.out.println(c1.toString());
		
		//Tracteur t2 = t1;
		//t1 est modifié car t2 possède la meme instance que t1
		
		Tracteur t2 = new Tracteur(t1);
		t2.peindre("Verte");
		Tracteur t3 = t1.clone();
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		// t1 est modifié car t2 possède la meme instance que t1
		
		
	}
}

