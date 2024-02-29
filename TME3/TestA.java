public class TestA{
	public static void main(String[] args){
		A a1 = new A();
		A a2 = a1;
		A a3 = new A();
		A a4 = null;
		a3 = null;
		a2 = null;
		a1 = null;
	}
}
