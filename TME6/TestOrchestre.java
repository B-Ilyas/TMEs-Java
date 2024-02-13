// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 41 (suite)

// Q.3

public class TestOrchestre {
	public static void main(String[] args) {
		Guitare g1 = new Guitare(500, 1050, "electrique");
		Piano p1 = new Piano(300, 5045, 20);
		Instrument i = new Instrument(15, 1);
		
		System.out.println(g1.toString());
		System.out.println(p1.toString());
		
		Orchestre o = new Orchestre(5);
		o.ajouterInstrument(p1);
		o.ajouterInstrument(g1);
		o.ajouterInstrument(i);
		
		o.jouer();
	}
}

// Q.41.5.a La méthode jouer() n'est pas trouvée dans la classe Instrument donc il ne peut pas faire jouer les instruments.
// Q.41.6.b La méthode jouer() est appliquée aux objets des classes filles d'Instrument.
