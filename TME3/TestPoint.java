// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle

public class TestPoint{
	public static void main(String[] args){
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(String.format("Distance entre p1 et p2 est : %.2f" , p1.distance(p2)));
		p1.deplaceToi(10, -10);
		System.out.println(p1.toString());
	}
}
