import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private int[] notes = new int[5];
    private int nbNotes;
    private static ArrayList<Etudiant> liste = new ArrayList<Etudiant>();
    
    public Etudiant(String nom) {
        this.nom = nom;
        liste.add(this);
    }
    
    public void entrerNote(int note) throws TabNotesPleinException {
        if (nbNotes < notes.length) {
            notes[nbNotes] = note;
            nbNotes++;
        } else {
            throw new TabNotesPleinException();
        }
        
    }
    
    public String getNom() {
        return nom;
    }
    
    public String toString() {
        String s = nom + " ";
        
        for (int i = 0; i < nbNotes - 1; i++) {
            s += notes[i] + " ";
        }
        
        try {
            return s + notes[nbNotes - 1];

        } catch (IndexOutOfBoundsException e) {
            return nom;
        }
        
    }
    
    public static void afficherListeEtudiants() {
        int nbEtu = 0;
        String s = "[";
        for (int i = 0; i < liste.size() - 1; i++) {
            s += liste.get(i).toString() + ", ";
            nbEtu++;
        }
        
        nbEtu++;
        
        try {
            s += liste.get(liste.size() - 1) + "]";
            System.out.println(String.format("Les %d etudiants :", nbEtu));
            System.out.println(s);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Aucun etudiant dans la liste");
        }
    }
    
}
