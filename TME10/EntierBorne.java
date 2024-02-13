public class EntierBorne {
	private int valeur;
	public static final int MAX = 100;
	public static final int MIN = -100;
	
	public EntierBorne(int valeur) throws HorsBornesException {
		if (valeur < MIN) {
			throw new HorsBornesException("Entier trop petit : " + valeur);
		} 
		if (valeur > MAX) {
			throw new HorsBornesException("Entier trop grand : " + valeur);
		}
		this.valeur = valeur;
	}
	
	public EntierBorne somme(EntierBorne eb) throws HorsBornesException {
		return new EntierBorne(valeur + eb.getValeur());
	}
	
	public int getValeur() {
		return valeur;
	}
	
	public EntierBorne divPar(EntierBorne eb) throws HorsBornesException, DivisionParZeroException {
		if (eb.getValeur() == 0) {
			throw new DivisionParZeroException();
		}
		
		return new EntierBorne((valeur / eb.getValeur()));
	}
	
	public String toString() {
		return "Valeur : " + valeur ;
	}
}
