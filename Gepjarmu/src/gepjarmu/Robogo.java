package gepjarmu;

public class Robogo extends Jarmu implements KisGepjarmu{
    private int maximalisSebesseg;

    public Robogo(int maximalisSebesseg, int aktualisSebesseg, String rendszam) {
        super(aktualisSebesseg, rendszam);
        this.maximalisSebesseg = maximalisSebesseg;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        return aktualisSebesseg>sebessegkorlat?true:false;
    }

    @Override
    public boolean haladhatitt(int sebesseg) {
        return maximalisSebesseg>sebesseg?true:false;
    }

    @Override
    public String toString() {
        return "Robogo:"+super.toString();
    }
}
