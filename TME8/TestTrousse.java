public class TestTrousse{
	public static void main (String[] args){
		Trousse t1 = new Trousse();
		Stylo s1 = new Stylo("Bleu");
		Stylo s2 = new Stylo("Vert");
		Stylo s3 = new Stylo("Rouge");
		Stylo s4 = new Stylo("Noir");
		Stylo s5 = new Stylo("Bleu");
		Stylo s6 = new Stylo("Bleu");
		Stylo s7 = new Stylo("Bleu");
		Stylo s8 = new Stylo("Noir");
		t1.addStylo(s1);
		t1.addStylo(s2);
		t1.addStylo(s3);
		t1.addStylo(s4);
		t1.addStylo(s5);
		t1.addStylo(s6);
		t1.addStylo(s7);
		t1.addStylo(s8);
		System.out.println(t1.toString());
		System.out.println(t1.compter("Bleu"));
	}
}
