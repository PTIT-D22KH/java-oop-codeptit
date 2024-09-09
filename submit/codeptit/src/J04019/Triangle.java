package J04019;

public class Triangle {
    private Edge a, b, c;
    private double perimeter;

    public Triangle(Point x, Point y, Point z) {
        this.a = new Edge(x, y);
        this.b = new Edge(x, z);
        this.c = new Edge(y, z);
        this.perimeter = a.getDistance() + b.getDistance() + c.getDistance();
    }

    public boolean valid() {
        double d1 = a.getDistance();
        double d2 = b.getDistance();
        double d3 = c.getDistance();
        return d1 > 0 && d2 > 0 && d3 > 0 && (d1 + d2 > d3) && (d1 + d3 > d2) && (d2 + d3 > d1);
    }

    public String getPerimeter() {
        return String.format("%.3f", perimeter);
    }
}