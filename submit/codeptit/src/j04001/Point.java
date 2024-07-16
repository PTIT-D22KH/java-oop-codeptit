package j04001;
public class Point {
    private double x;
    private double y;

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
    double getX() {
        return x;
    }
    double getY() {
        return y;
    }
    double distance(Point secondPoint) {
        double res = Math.sqrt((x - secondPoint.x) * (x - secondPoint.x) + (y - secondPoint.y) * (y - secondPoint.y));
        return res;
    }
    static double distance(Point p1, Point p2) {
        double res = Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
        return res;
    }
    @Override
    public String toString() {
        String res = "(" + String.valueOf(this.x) + "," + String.valueOf(this.y) + ")";
        return res;
    }
}
