package geometriaialakzatok.geometry;

public class Square implements Rectangle, Rhombus{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
    @Override
    public double getB(){
        return a;
    }
    
    @Override
    public double getAlpha(){
        return 90;
    }
    
    @Override
    public String toString() {
        return "Square[" + "a=" + a + ']';
    }
}
