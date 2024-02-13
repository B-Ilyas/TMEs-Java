

public class TestPile {
    public static void main(String[] args) {
        Pile p = new Pile(3);
        Machin m1 = new Machin("un cheveu");
        Machin m2 = new Machin("une lampe");
        Machin m3 = new Machin("Floch le chien");
        
        // Affichage des noms de mes machins
        // System.out.println(m1.getNom());
        // System.out.println(m2.getNom());
        // System.out.println(m3.getNom());
        
        // On empile m1 sur la pile vide, puis m2 sur m1 puis m3 sur m2
        p.empiler(m1);
        p.empiler(m2);
        p.empiler(m3);
        System.out.print(String.format("J'ai empilé %s, %s et %s dans la pile :\n", m1.toString(), m2.toString(), m3.toString()) + p.toString());
        
        // On dépile une fois et affiche la pile obtenue
        System.out.print("J'ai dépilé " + p.depiler().toString() + " donc ma pile est :\n" + p.toString());
        
        // On empile deux autres machins dans la pile et affiche la pile obtenue
        Machin m4 = new Machin("une salle de tme");
        System.out.print(String.format("Je veux empiler %s et %s dans la pile :\n", m4.toString(), m3.toString()));
        p.empiler(m4);
        p.empiler(m3);
        System.out.print("Donc on obtient la pile :\n" + p.toString());
        
        // On dépile quatre fois -> pile vide
        for (int i = 0; i < 4; i++) {
            if (p.estVide()) {
                System.out.println(p.toString());
            } else {
                System.out.println("J'ai dépilé " + p.depiler().toString());
            }
        }
        
        
    }
}
