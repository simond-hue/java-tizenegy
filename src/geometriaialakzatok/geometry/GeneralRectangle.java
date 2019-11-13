package geometriaialakzatok.geometry;

public class GeneralRectangle {
    private double a;
    private double b;

    public GeneralRectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return "GeneralRectangle[" + "a=" + a + ", b=" + b + ']';
    }
}
