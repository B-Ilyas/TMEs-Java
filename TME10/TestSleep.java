// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle


// Exercice 66


// Q.1

import java.util.*;

public class TestSleep {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print( "Entrer un entier : " );
		
		try {
			int x = scanner.nextInt();
			System.out.println("Attente de " + x + " millisecondes");
			Thread.sleep(x);
			System.out.println("Fin de l'attente");
			
		} catch (InputMismatchException e) {
			System.out.println("Le nombre est mal formé");
			
		} catch (InterruptedException e) {
			System.out.println("Arret interrompu");
		}
		
	}
}

// Q.2 Ajouter throws InterruptedException à la ligne 13 et supprimer le 2ème bloc catch
