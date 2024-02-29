public class TestForet{
	public static void main (String[] args){
		Foret f1 = new Foret(5);
		System.out.println(f1.toString());
		for (int i = 0; i< 6; i++){
			f1.placer(new Arbre("Pin"));
			f1.placer(new Champignon("Cepe"));
			f1.placer(new ChampignonToxique("Amanite"));
		} 
		System.out.println(f1.toString());
		//f1.ramasserTout();
		Panier p1 = new Panier(8.0);
		f1.ramasser(p1);
		System.out.println(f1.toString());
		System.out.println(p1.toString());
	}
}
