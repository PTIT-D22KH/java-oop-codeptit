package j04009;

public class Triangle {
    private Edge a, b, c;
    private boolean isValid;
    private double perimeter;
    private double area;

    private boolean checkValid() {
        return (a.length > 0 && b.length > 0 && c.length > 0 && a.length + b.length > c.length && a.length + c.length > b.length && b.length + c.length > a.length);
    }
    private double calArea() {
        return Math.sqrt((a.length + b.length + c.length) * (a.length + b.length - c.length) * (b.length + c.length - a.length) * (c.length + a.length -  b.length)) * 0.25;
    }
    public Triangle(Edge a, Edge b, Edge c) {
        
        this.a = a;
        this.b = b;
        this.c = c;
        isValid = checkValid();
        this.perimeter = a.length + b.length + c.length;
        this.area = calArea();
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
