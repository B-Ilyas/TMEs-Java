public class TestComplexe{
	public static void main(String[] args){
		Complexe c1 = new Complexe();
		Complexe c2 = new Complexe(3,0);
		Complexe c3 = new Complexe(-6,9);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(String.format("%B" , c2.estReel() == true));
		System.out.println(String.format("%B" , c3.estReel() == false));
		System.out.println(c2.addition(c3).toString());
		System.out.println(c2.multiplication(c3).toString());
	}
}
