// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 34


// Q.1 & Q.2

public class Cone {
	private double rayon;
	private double hauteur;
	public final static double PI = 3.14159;
	private static int nbCones = 0;
	
	public Cone(double r, double h) {
		h = hauteur;
		r = rayon;
		nbCones++;
	}
	
	public Cone() {
		this((double)(Math.random()*10) , (double)(Math.random()*10)); 
	}
	
	public double getVolume() {
		return (1/3)*PI*rayon*rayon*hauteur;
	}
	
	public String toString() {
		return "Cone r = " + rayon + "h = " + hauteur + "V = " + getVolume();
	}
	
	public static int getNbCones() {
		return nbCones;
	}
}
