package j04009;

public class Edge {
    Point a, b;
    double length;
    public Edge(Point a, Point b) {
        this.length = a.distance(b);
    }
}
