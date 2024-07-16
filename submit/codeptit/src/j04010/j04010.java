package j04010;

import java.util.Scanner;

public class j04010 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t= input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase() {
        double x1, y1, x2, y2, x3, y3;
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        Point c = new Point(x3, y3);
        Edge x = new Edge(a, b);
        Edge y = new Edge(a, c);
        Edge z = new Edge(b, c);
        Triangle new_triangle = new Triangle(x, y, z);
        if (new_triangle.getIsValid() == false) {
            System.out.println("INVALID");
        } else {
            System.out.printf("%.3f\n", new_triangle.getAreaOfCircumscribed());
        }
        
    }
}
