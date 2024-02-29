public class Complexe{
	private double reelle;
	private double imag;
	public Complexe(double reelle, double imag){
		this.reelle = reelle;
		this.imag = imag;
	}
	public Complexe(){
		this((Math.random()*4)-2, (Math.random()*4)-2);
	}
	public String toString(){
		return "(" + reelle + "+" + imag + "i)" ;
	}
	public boolean estReel(){
		if (this.imag == 0){
			return true;
		}
		return false;
	}
	public Complexe addition(Complexe z){
		return new Complexe(this.reelle + z.reelle , this.imag + z.imag);
	}
	public Complexe multiplication(Complexe z){
		return new Complexe(((this.reelle * z.reelle) - (this.imag * z.imag)),(( this.reelle * z.imag) + (this.imag * z.reelle)));
	}
}
