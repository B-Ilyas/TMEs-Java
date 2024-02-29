public class TestFleur{
	public static void main(String[] args){
		Fleur tulipe = new Fleur("Tulipe" , "Jaune");
		Fleur f1 = new Fleur();
		System.out.println(tulipe.getNom());
		System.out.println(tulipe.toString());
		System.out.println(f1.toString());
		System.out.println("Affichage: " + f1);
		String a = "1" + '1' + 1;
		System.out.println(a);

		for (int i =0 ; i<100;i++){
			char val = (char)((Math.random()*('z'-'a'+1))+'a');
			System.out.println(val);
		}
	}
}
