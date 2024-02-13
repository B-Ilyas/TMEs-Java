// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle

public class Point{
	private int posx;
	private int posy;
	
	public Point (int posx , int posy){
		this.posx = posx;
		this.posy = posy;
	}
	public Point(){
		this((int)(Math.random()*100) - 50 , (int)(Math.random()*(100)) - 50 );
	}
	public void setPosx(int posx){
		this.posx = posx;
	}
	public void setPosy(int posy){
		this.posy = posy;
	}
	public int getPosx(){
		return posx;
	}
	public int getPosy(){
		return posy;
	}
	public String toString(){
		return "(" + posx + " , " + posy + ")";
	}
	public double distance(Point p){
		return Math.sqrt(((posx - p.posx)*(posx - p.posx)) + ((posy - p.posy)*(posy - p.posy)));
	}
	public void deplaceToi(int newx , int newy){
		posx += newx;
		posy += newy;
	}
	public Point clone(){
		return new Point(posx, posy);
	}
	public boolean egalitePoint(Point p){
		return ((p.posx == posx) && (p.posy == posy));
	}
}
