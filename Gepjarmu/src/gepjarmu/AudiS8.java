package gepjarmu;

public class AudiS8 extends Jarmu{
    private boolean lezerblokkolo;

    public AudiS8(boolean lezerblokkolo, int aktualisSebesseg, String rendszam) {
        super(aktualisSebesseg, rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        if(this.lezerblokkolo) return false;
        else return this.aktualisSebesseg>sebessegkorlat?true:false;
    }

    @Override
    public String toString() {
        return "Audi:"+super.toString();
    }
}
