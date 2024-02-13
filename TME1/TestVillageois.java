public class TestVillageois{
	public static void main(String[] args){
		Villageois v1 = new Villageois("Albert");
		Villageois v2 = new Villageois("Hubert");
		Villageois v3 = new Villageois("Maubert");
		Villageois v4 = new Villageois("Robert");
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
		System.out.println(v4.toString());
		if (v1.poidsSouleve() + v2.poidsSouleve() + v3.poidsSouleve() + v4.poidsSouleve() >= 100) {
			System.out.println("Ils sont forts");	
		} else {
			System.out.println("Ils sont nuls");
		}
	}
	
}
