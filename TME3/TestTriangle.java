// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle

public class TestTriangle{
	public static void main(String[] args){
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		Point p4 = new Point();
		
		Triangle t1 = new Triangle(p1 , p2 ,p3);
		Triangle t2 = t1.clone();
		Triangle t3 = new Triangle(p1, p2 ,p4);
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		
		
		if (!t1.equals(t2)){
			System.out.println("Ils ne sont pas egaux referentiellement");
		} 
		if (t1.egalite(t2)){
			System.out.println("Ils sont egaux structurellement");
		}
		if (!t1.egalite(t3)){
			System.out.println("Ils ne sont pas egaux structurellement");
		} 		
	}
}
