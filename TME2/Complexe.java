// 21118889 BENYAHIA Ilyas
// 21106878 SONG Michelle


// Exercice 16

// Q.1 & Q.2

public class Complexe {
    private double reelle, imag;

    public Complexe(double reelle, double imag) {
        this.reelle = reelle;
        this.imag = imag;
    }

    public Complexe() {
        this((Math.random()*4) - 2, Math.random()*4 - 2);
    }

    public String toString() {
        return String.format("(%.2f + %.2fi)", reelle, imag);
    }

    public boolean estReel(Complexe c) {
        if (c.imag == 0) {
            return true;
        }
        return false;
    }

    public void addition(Complexe c1, Complexe c2) {
        reelle = c1.reelle + c2.reelle;
        imag = c1.imag + c2.imag;
    }

    public void multiplication(Complexe c1, Complexe c2) {
        reelle = c1.reelle * c2.reelle - c1.imag * c2.imag;
        imag = c1.reelle * c2.imag + c1.imag * c2.reelle;
    }
}
