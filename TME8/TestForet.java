public class TestForet {
    public static void main(String[] args) {
        Foret forest = new Foret(10);
        
        // Ajout de 30% de Pins et 70% de Cepes dans la foret
        for (int i = 0; i < 10; i++) {
            if (Math.random() < 0.3) {
                Arbre a = new Arbre("Pin");
                
                boolean placerA = forest.placer(a);
                
                while (placerA == false) {
                    placerA = forest.placer(a);
                }
                
            } else {
                Champignon c = new Champignon("Cepe");
                boolean placerC = forest.placer(c);
                
                while (placerC == false) {
                    placerC = forest.placer(c);
                }
                
            }
            
        }
        
        // Ajout de 5 Amanites dans la foret
        for (int i = 0; i < 5; i++) {
            ChampignonToxique ct = new ChampignonToxique("Amanite");
                
            boolean placerCT = forest.placer(ct);
                
            while (placerCT == false) {
                placerCT = forest.placer(ct);
            }
        }
        
        System.out.println(forest.toString());
        
        
        // Test de la methode ramasserTout
        // System.out.println(forest.ramasserTout());
        // System.out.println(forest.toString());
        
        
        // Test de la fonction ramasser
        Panier p = new Panier(8);
        forest.ramasser(p);
        System.out.println(p.toString());
        System.out.println(forest.toString());
    }
}
