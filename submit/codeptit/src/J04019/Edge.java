package J04019;

public class Edge {
    private Point a, b;
    private double distance;

    public Edge(Point a, Point b) {
        this.a = a;
        this.b = b;
        this.distance = a.getDistance(b);
    }

    public double getDistance() {
        return distance;
    }
}