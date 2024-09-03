package J04019;

import java.util.Scanner;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        return new Point(x, y);
    }

    public double getDistance(Point other) {
        return Math.sqrt((this.x - other.x) * (this.x - other.x) + (this.y - other.y) * (this.y - other.y));
    }
}
