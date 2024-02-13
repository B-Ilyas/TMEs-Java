// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle


// Exercice 16 (suite)

// Q.3

public class TestComplexe {
    public static void main(String[] args) {
        Complexe c1 = new Complexe(1, 1);
        Complexe c2 = new Complexe(2, 0);
        Complexe c3 = new Complexe(0, 1);
		
		// affichage de c1, c2 et c3
        System.out.println("c1 = " + c1.toString());
        System.out.println("c2 = " + c2.toString());
        System.out.println("c3 = " + c3.toString());
		
		// nombre réel ?
		System.out.println("c1 est réel ? : " + c1.estReel(c1));
		System.out.println("c2 est réel ? : " + c2.estReel(c2));
		System.out.println("c3 est réel ? : " + c3.estReel(c3));
		
		// multiplication
		Complexe c1foisc2 = new Complexe(0, 0);
		Complexe c3foisc3 = new Complexe(0, 0);
		
        c1foisc2.multiplication(c1, c2);
        c3foisc3.multiplication(c3, c3);
        
        System.out.println("c1 * c2 = " + c1foisc2.toString());
        System.out.println("c3 * c3 = " + c3foisc3.toString());
        
        // addition
        Complexe c1plusc2 = new Complexe(0, 0);
		Complexe c1plusc3 = new Complexe(0, 0);
		
        c1plusc2.addition(c1, c2);
        c1plusc3.addition(c1, c3);
        
        System.out.println("c1 + c2 = " + c1plusc2.toString());
        System.out.println("c1 + c3 = " + c1plusc3.toString());
    }
}
