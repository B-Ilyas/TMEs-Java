// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 41 (suite)

// Q.4

public class Orchestre {
	private int nbInstruments = 0;
	private Instrument[] tab;
	
	public Orchestre(int max) {
		tab = new Instrument[max];
	}
	
	public void ajouterInstrument(Instrument x) {
		if (nbInstruments < tab.length) {
			tab[nbInstruments] = x;
			nbInstruments++;
		}
	}
	
	public void jouer() {
		for(int i = 0; i < tab.length; i++) {
			if (tab[i] == null) {
				System.out.println("Pas d'instruments !!!");
			} else {
				tab[i].jouer();
			}
		}
	}
	
}
