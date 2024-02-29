public class TestTrianglePascal{
	public static void main( String[] Args){
		TrianglePascal t1 = new TrianglePascal(2);
		TrianglePascal t2 = new TrianglePascal(5);
		TrianglePascal t3 = new TrianglePascal(10);
		
		t1.remplirTriangle();
		t2.remplirTriangle();
		t3.remplirTriangle();
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
	}
}
