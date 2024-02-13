// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 35


// Q.1

public class Alea {
	public static char lettre() {
		return (char)((Math.random()*('z' - 'a' + 1)) + 'a');
	}
	
	private Alea() { }
	
	public static String chaine() {
		String s = ""; 
		for (int i = 0; i < 10; i++) {
			s += lettre();
		}
		return s;
	}
	
	public static void main (String[] args) {
		System.out.println(Alea.chaine());
	}
}


// 35.2 : lettre() et chaine() sont des méthodes de classes car il n'y a pas d'instance crée et donc pas de dépendance.
