public class VectN{
	private int[] tab;
	
	public VectN(int n){
		tab = new int[n];
	}
	
	public VectN(int n , int valMax){
		this(n);
		for (int i = 0; i < tab.length; i++){
			tab[i] = (int)(Math.random()*valMax);
		}
	}
	
	public VectN(){
		this(5,9);
	}
	
	public VectN(int a, int b, int c){
		this(3);
		tab[0] = a;
		tab[1] = b;
		tab[2] = c;
	}
	
	public int somme(){
		int s = 0;
		for (int i : tab) {
			 s += i;
		}
		
		return s;
	}
	
	public String toString(){
		if (tab.length == 0) {
			return "[]";
		}
		
		String res = "[";
		for (int i = 0; i < tab.length - 1; i++) {
			res += tab[i] + ", ";
		}
		
		return res += tab[tab.length - 1] + "]";
	}
	
	public int[] getTab(){
		int[] c = new int[tab.length];
		for(int i = 0; i < tab.length; i++) {
			c[i] = tab[i];
		}
		
		return c;
	}
}
