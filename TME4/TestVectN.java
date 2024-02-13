


public class TestVectN {
	public static void main (String[] args) {
		VectN v1 = new VectN(3); // Vecteur vide
		VectN v2 = new VectN(3,5);
		VectN v3 = new VectN();
		VectN v4 = new VectN(1,2,3);
		
		System.out.println(v2.toString());
		System.out.println(String.format("Somme de v2 : %d", v2.somme()));
		
		VectN vect = new VectN (4,5,6);
		int [] tab = vect.getTab();
		tab[0] = 100;
		System.out.println(vect);
	}
}
