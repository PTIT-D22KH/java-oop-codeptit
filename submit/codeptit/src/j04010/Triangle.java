package j04010;

public class Triangle {
    private Edge a, b, c;
    private boolean isValid;
    private double perimeter;
    private double area;
    private double areaOfCircumscribed;
    private double r; //ban kinh duong tron ngoai tiep

    private boolean checkValid() {
        return (a.length > 0 && b.length > 0 && c.length > 0 && a.length + b.length > c.length && a.length + c.length > b.length && b.length + c.length > a.length);
    }
    private double calArea() {
        return 0.25 * Math.sqrt((a.length + b.length + c.length) * (a.length + b.length - c.length) * (b.length + c.length - a.length) * (c.length + a.length -  b.length));
    }
    private double calR() {
        return a.length * b.length * c.length / (4 * area);
    }
    public Triangle(Edge a, Edge b, Edge c) {
        
        this.a = a;
        this.b = b;
        this.c = c;
        isValid = checkValid();
        this.perimeter = a.length + b.length + c.length;
        this.area = calArea();
        this.r = calR();
        this.areaOfCircumscribed = this.r * this.r * Math.PI;
    }
    public boolean getIsValid() {
        return isValid;
    }
    public double getAreaOfCircumscribed() {
        return areaOfCircumscribed;
    }
    
    
}