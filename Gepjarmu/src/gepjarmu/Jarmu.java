package gepjarmu;

public abstract class Jarmu {
    protected int aktualisSebesseg;
    private String rendszam;

    public Jarmu(int aktualisSebesseg, String rendszam) {
        this.aktualisSebesseg = aktualisSebesseg;
        this.rendszam = rendszam;
    }
    
    public abstract boolean gyorshajtottE(int sebessegkorlat);

    @Override
    public String toString() {
        return String.format("%s - %d km/h", this.rendszam,this.aktualisSebesseg);
    }
}
