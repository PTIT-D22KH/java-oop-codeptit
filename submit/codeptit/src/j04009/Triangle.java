package j04009;

public class Triangle {
    private Edge a, b, c;
    private boolean isValid;
    private double perimeter;
    private double area;

    private boolean checkValid(Edge a, Edge b, Edge c) {
        return (a.length > 0 && b.length > 0 && c.length > 0 && a.length + b.length > c.length && a.length + c.length > b.length && b.length + c.length > a.length);
    }
    private double calArea(Edge a, Edge b, Edge c) {
        return 0.25 * Math.sqrt((a.length + b.length + c.length) * (a.length + b.length - c.length) * (b.length + c.length - a.length) * (c.length + a.length -  b.length));
    }
    public Triangle(Edge a, Edge b, Edge c) {
        isValid = checkValid(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = a.length + b.length + c.length;
        this.area = calArea(a, b, c);
    }
    public boolean getIsValid() {
        return isValid;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public double getArea() {
        return area;
    }
}
