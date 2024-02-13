public class TestEtudiants {
    public static void main(String[] notes) {
        // String s = "";
        // for (int i = 0; i < notes.length - 1; i++) {
        //     try {
        //         int note = Integer.parseInt(notes[i]);
        //         s += String.format("%d est une note, ", note);
        //     } catch (NumberFormatException e) {
        //         s += "\n" + notes[i] + " est un nom, ";
        //     }
 
        // }
        //
        // try {
        //     int note = Integer.parseInt(notes[notes.length - 1]);
        //     s += String.format("%d est une note", note);
        // } catch (NumberFormatException e) {
        //     s += notes[notes.length - 1] + " est un nom";
        // }
        //
        // System.out.println(s);
        
        Etudiant etu = null;
        
        for (int j = 0; j < notes.length; j++) {
            try {
                int note = Integer.parseInt(notes[j]);
                etu.entrerNote(note);
                
            } catch (NumberFormatException e) {
                etu = new Etudiant(notes[j]);
                
            } catch (TabNotesPleinException e) {
                System.out.println(String.format("le tableau de notes de l'etudiant %s est plein", etu.getNom()));
            }
        }
        
        Etudiant.afficherListeEtudiants();
        
    }
}
