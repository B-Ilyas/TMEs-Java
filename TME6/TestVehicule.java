// 21106878 SONG Michelle
// 21118889 BENYAHIA Ilyas


// Exercice 42 (suite)

// Q.5

public class TestVehicule {
	public static void main(String[] args) {
		Velo v1 = new Velo(17, "MyVTT");
		Voiture car = new Voiture("Ford", 30, 15);
		Camion c1 = new Camion("Mercedes", 100, 70);  
		System.out.println(v1.toString());
		
		v1.transporter("Australie" , "Antarctique");
		
		Vehicule[] tab = new Vehicule[3];
		tab[0] = v1;
		tab[1] = car;
		tab[2] = c1;
		
		for (int i = 0; i < tab.length; i++) {
			tab[i].rouler(10.0);
		}
		
		car.transporter(5, 200);
		
		car.approvisionner(30.0);
		c1.approvisionner(10.0);
	}
} 
