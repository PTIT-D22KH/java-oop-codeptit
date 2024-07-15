package j04001;
import java.util.Scanner;
public class j04001 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }

    }
    public static void testCase() {
        double x1, y1, x2, y2;
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        System.out.printf("%.4f\n", a.distance(b));

    }
}
