public class Navire{
	private String pays;
	private double capacite;
	private double charge; 
	private Marchandise[] tab = Marchandise[10];
	public final int id;
	private int cpt = 0;
	
	public Navire(String pays , double charge){
		this.pays = null;
		this.charge = charge;
		id = cpt;
		cpt++;
	}
	
	public double calculerPoidsCharge(){
		double res = 0.0;
		for (int i = 0 ; i < tab.length ; i++){
			if (tab[i] != null){
				res += tab[i].getPoids();
			}
		}
		return res;
	}
	
	public void ajouterMarchandise (Marchandise m){
		if (cpt == tab.length){
			System.out.println("Plus d'espace pour une marchandise supplémenaire");
		} else {
			if((this.calculerPoidsCharge() + m.getPoids()) >= charge){
				System.out.println("Capacité saturé");
			} else {
				for (int i = 0 ; i < tab.length ; i++){
					if (tab[i] == null){
						tab[i] = m;
					}
				}
			}
		}
	}
}
