package arlap;

public class Pogacsa extends Peksutemeny{

    public Pogacsa(double menyiseg, double alapar) {
        super(menyiseg, alapar);
    }

    @Override
    public void megkostol() {
        super.menyiseg*=0.5;
    }

    @Override
    public String toString() {
        return "Pogacsa: " + super.toString();
    }
}
