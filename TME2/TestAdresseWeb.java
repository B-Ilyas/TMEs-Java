// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle


// Exercice 14 (suite)


// Q.2

public class TestAdresseWeb {
	public static void main(String[] args) {
		
		AdresseWeb a1 = new AdresseWeb("http", "youtube.fr", "/300585/index.html");
		AdresseWeb a2 = new AdresseWeb("youtube.fr", "/300585/index.html");
		AdresseWeb a3 = new AdresseWeb("youtube.fr");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
	}
}


// La surcharge de constructeurs permet d'instancier avec un nombre de paramètres variés
// L'interet d'utiliser this(...) est d'économiser des instructions

