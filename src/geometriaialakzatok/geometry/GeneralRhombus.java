package geometriaialakzatok.geometry;

public class GeneralRhombus extends Rhombus{
    private double a;
    private double alpha;

    public GeneralRhombus(double a, double alpha) {
        this.a = a;
        this.alpha = alpha;
    }

    public double getA() {
        return a;
    }

    public double getAlpha() {
        return alpha;
    }

    @Override
    public String toString() {
        return "GeneralRhombus[" + "a=" + a + ", alpha=" + alpha + ']';
    }
    
    
}
