package j04008;

public class Triangle {
    private Edge a, b, c;
    private boolean isValid;
    private double perimeter;


    private boolean checkValid(Edge a, Edge b, Edge c) {
        return (a.length > 0 && b.length > 0 && c.length > 0 && a.length + b.length > c.length && a.length + c.length > b.length && b.length + c.length > a.length);
    }
    public Triangle(Edge a, Edge b, Edge c) {
        isValid = checkValid(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = a.length + b.length + c.length;
    }
    public boolean getIsValid() {
        return isValid;
    }
    public double getPerimeter() {
        return perimeter;
    }
}
