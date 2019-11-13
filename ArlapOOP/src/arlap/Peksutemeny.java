package arlap;

public abstract class Peksutemeny implements Arlap{

    protected double menyiseg;
    protected double alapar;

    public Peksutemeny(double menyiseg, double alapar) {
        this.menyiseg = menyiseg;
        this.alapar = alapar;
    }
    
    @Override
    public double mennyibeKerul(){
        return alapar*menyiseg;
    }
    
    public abstract void megkostol();

    @Override
    public String toString() {
        return String.format("%f db - %f Ft",this.menyiseg,this.mennyibeKerul());
    }
    
    
}
