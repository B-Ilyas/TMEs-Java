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
