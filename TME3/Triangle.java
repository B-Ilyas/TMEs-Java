// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle

public class Triangle{
	private Point p1;
	private Point p2;
	private Point p3;
	
	public Triangle(){
		this(new Point() , new Point(), new Point());
	}
	public Triangle( Point p1 , Point p2 , Point p3){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	public double getPerimetre(){
		return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
	}
	public String toString(){
		return "Le triangle est formé des points: " + p1.distance(p2) + " " + p2.distance(p3) + " " + p3.distance(p1) + "\nSon perimetre est de : " + (p1.distance(p2) + p2.distance(p3) + p3.distance(p1)) ;
	}
	public Triangle clone(){
		return new Triangle( p1.clone() , p2.clone() , p3.clone());
	}
	public boolean egalite(Triangle t){
		return ((t.p1.egalitePoint(p1)) && (t.p2.egalitePoint(p2)) && (t.p3.egalitePoint(p3)));
	}
}
