package geometriaialakzatok.geometry;

public class GeneralParalelogramma implements Paralelogramma{

    private double a;
    private double b;
    private double alpha;
    
    public GeneralParalelogramma(double a, double b, double alpha) {
        this.a = a;
        this.b = b;
        this.alpha = alpha;
    }
    
    @Override
    public double getA() {
        return a;
    }

    @Override
    public double getAlpha() {
        return alpha;
    }

    @Override
    public double getB() {
        return b;
    }
    
}
