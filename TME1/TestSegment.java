public class TestSegment{
	public static void main(String[] args){
		Segment p1 = new Segment(6,8);
		Segment p2 = new Segment(12,5);
		if (p1.longueur() >p2.longueur()){
			System.out.println("1er segment est le plus long");
		}else{
			System.out.println("2eme segment est le plus long");
		}
	}
}
