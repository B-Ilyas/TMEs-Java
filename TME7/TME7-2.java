::::::::::::::
AnimalAPattes.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public abstract class AnimalAPattes extends Animal {
	public final int nbPattes;
	
	public AnimalAPattes(String nom, int age, int nbPattes) {
		super(nom, age);
		this.nbPattes = nbPattes;
	}
	
	public AnimalAPattes(String nom, int nbPattes) {
		super(nom);
		this.nbPattes = nbPattes;
	}
	
	public abstract void crier();
	
	public String toString() {
		return super.toString() + ", a " + nbPattes + " pattes";
	}

}
::::::::::::::
Animal.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public abstract class Animal {
	protected String nom;
	protected int age;
	
	public Animal(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public Animal(String nom) {
		this(nom, 1);
	}
	
	public void vieillir() {
		age++;
	}
	
	public abstract void crier();
	
	public String toString() {
		return " " + nom + ", " + age + " ans";
	}

}
::::::::::::::
AnimalSansPattes.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public abstract class AnimalSansPattes extends Animal {

	public AnimalSansPattes(String nom, int age) {
		super(nom, age);
	}
	
	public AnimalSansPattes(String nom) {
		super(nom);
	}
	
	public abstract void crier();
	
	public String toString() {
		return super.toString() + " sans pattes";
	}
}
::::::::::::::
Boa.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public class Boa extends AnimalSansPattes {

	public Boa(String nom, int age) {
		super(nom, age);
	}
	
	public Boa(String nom) {
		super(nom);
	}
	
	public void crier() {
		System.out.println("Sssss");
	}
	
	public String toString() {
		return "Boa" + super.toString();
	}
}
::::::::::::::
Carre.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 46


public class Carre extends Rectangle {
	private double cote;
	
	public Carre(double cote) {
		super(cote, cote);
		this.cote = cote;
	}
	
	public double surface() {
		return super.surface();
	}
	
	public double perimetre() {
		return super.perimetre();
	}
	
	public String toString() {
		return String.format("Carre de cote %.2f, de surface %.2f et de perimetre %.2f", cote, surface(), perimetre());
	}
}
::::::::::::::
Cercle.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 46


public class Cercle extends Ellipse {
	private double r;
	
	public Cercle(int r) {
		super(r, r);
		this.r = r;
	}
	
	public double surface() {
		return super.surface();
	}
	
	public double perimetre() {
		return super.perimetre();
	}
	
	public String toString() {
		return String.format("Cercle de rayon %.2f de surface %.2f et de perimetre %.2f", r, surface(), perimetre());
	}
}

::::::::::::::
Ellipse.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 46


public class Ellipse extends Figure2D {
	private double a, b;
	
	public Ellipse(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double surface() {
		return Math.PI * a * b;
	}
	
	public double perimetre() {
		return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
	}
	
	public String toString() {
		return String.format("Ellipse de longueur %.2f et %.2f, de surface %.2f et de perimetre %.2f", a, b, surface(), perimetre());
	}
	
}
::::::::::::::
Figure2D.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 46


public abstract class Figure2D extends Figure {
	
	public abstract double perimetre();
	public abstract double surface();


}
::::::::::::::
Figure.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 46


public abstract class Figure {

	public abstract double surface();

}
::::::::::::::
Menagerie.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public class Menagerie {
	public final Animal[] tab;
	private int nbAnimal = 0;
	
	public Menagerie(int nbAnimalmax) {
		tab = new Animal[nbAnimalmax];
	}
	
	public void ajouter(Animal a) {
		if (nbAnimal < tab.length) {
			tab[nbAnimal] = a;
			nbAnimal++;
		}
	}
	
	public String toString() {
		String s = "[";
		int i;
		for (i = 0; i < nbAnimal - 1; i++) {
			s += tab[i].toString() + ", ";
		}
		
		return s + tab[i] + "]";
	}
	
	public void midi() {
		for (Animal a : tab) {
			if (a != null) {
				a.crier();
			}
		}
	}
	
	public void vieillirTous() {
		for (Animal a : tab) {
			if (a != null) {
				a.vieillir();
			}
		}
	}
	
}
::::::::::::::
Rectangle.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 46


public class Rectangle extends Figure2D {
	private double lng, lrg;
	
	public Rectangle(double lng, double lrg) {
		this.lng = lng;
		this.lrg = lrg;
	}
	
	public double surface() {
		return lng * lrg;
	}
	
	public double perimetre() {
		return 2*(lng + lrg);
	}
	
	public String toString() {
		return String.format("Rectangle de longueur %.2f, de largeur %.2f, de surface %.2f et de perimetre %.2f", lng, lrg, surface(), perimetre());
	}
}
::::::::::::::
TestFigure.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 46


public class TestFigure {
	public static void main(String[] args) {
		Figure[] tab = new Figure[5];
		
		tab[0] = new Rectangle(3, 1);
		tab[1] = new Carre(5);
		tab[2] = new Ellipse(8, 6);
		tab[3] = new Cercle(1);
		
		
		for (Figure f : tab) {
			if (f != null) {
				System.out.println(f.toString());
			}
		}
	}
}
::::::::::::::
TestMenagerie.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public class TestMenagerie {
	public static void main(String[] args) {
	
		Menagerie m = new Menagerie(5);
		Boa b1 = new Boa("Bob");
		Vache v1 = new Vache("Marguerite", 5);
		Vache v2 = new Vache("Dell");
		Boa b2 = new Boa("PPTI", 35);
		
		m.ajouter(v1);
		m.ajouter(b1);
		m.ajouter(v2);
		m.ajouter(b2);
		
		for (Animal a : m.tab) {
			if (a != null) {
				System.out.println(a.toString());
			}
		}
		
		m.vieillirTous();
		m.midi();
		
		for (Animal a : m.tab) {
			if (a != null) {
				System.out.println(a.toString());
			}
		}
	}
}
::::::::::::::
Vache.java
::::::::::::::
// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 45


public class Vache extends AnimalAPattes {
	private double quantite;
	
	public Vache(String nom, int age) {
		super(nom, age, 4);
		quantite = (Math.random()*25) + 5;
	}
	
	public Vache(String nom) {
		super(nom, 4);
		quantite = (Math.random()*25) + 5;
	}
	
	public void crier() {
		System.out.println("Meuuh");
	}
	
	public String toString() {
		return String.format("Vache %s et contient %.2f L de lait", super.toString(), quantite);
	}
}
