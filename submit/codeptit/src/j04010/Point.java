package j04010;

public class Point {
    private double x, y;

    public Point() {

    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(Point secondPoint) {
        double res = Math.sqrt((x - secondPoint.x) * (x - secondPoint.x) + (y - secondPoint.y) * (y - secondPoint.y));
        return res;
    }
    public static double distance(Point p1, Point p2) {
        double res = Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
        return res;
    }
    @Override
    public String toString() {
        String res = "(" + this.x + "," + this.y + ")";
        return res;
    }
}
