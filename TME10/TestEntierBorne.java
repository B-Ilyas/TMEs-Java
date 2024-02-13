public class TestEntierBorne {
	public static void main (String[] args) {
		try {
			EntierBorne ebX = new EntierBorne((int)(Math.random()* 301) - 150);
			EntierBorne ebY = new EntierBorne((int)(Math.random()* 3));
			System.out.println(ebX.toString());
			System.out.println(ebY.toString());
			System.out.println(ebX.somme(ebY).toString());
			EntierBorne ebZ = ebX.divPar(ebY);
			System.out.println(ebZ.toString());
			
		} catch (DivisionParZeroException e) {
			System.out.println("Division par 0");
			
		} catch (HorsBornesException e) {
			System.out.println("Depassement des bornes");
		} 
	}
}

// Q.7 
// (a) Oui cela compile car DivisionParZeroException et HorsBornesException heritent de Exception.
// (b) Oui, on peut remplacer catch(Exception e) par tous les catch mais il est nécessaire de mettre plusieurs catch pour pouvoir spécialiser l'erreur
// (c) Oui, cependant il est préférable de ne pas le faire car s'il y a une exception, la fonction s'arretera.
