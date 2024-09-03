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
        if (a.getDistance() < 0 || b.getDistance() < 0|| c.getDistance() < 0|| (a.getDistance() + b.getDistance() <= c.getDistance()) || (a.getDistance() + c.getDistance() <= b.getDistance()) || (b.getDistance() + c.getDistance() < a.getDistance())) { 
            return false;
        }
        return true;
    }



    public String getPerimeter() {
        return String.format("%.3f", perimeter);
    }
    
}
