package j04018;

import java.util.Scanner;

public class j04018 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase() {
        int x1, y1, x2, y2;
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        ComplexNumber a = new ComplexNumber(x1, y1);
        ComplexNumber b = new ComplexNumber(x2, y2);
        // ComplexNumber c = a.addComplexNumber(b);
        // ComplexNumber d = a.multiplyComplexNumber(b);
        // System.out.println("a, b: " + a + ", " + b);
        ComplexNumber c = a.addComplexNumber(b).multiplyComplexNumber(a);
        ComplexNumber d = (a.addComplexNumber(b)).multiplyComplexNumber(a.addComplexNumber(b));
        System.out.println(c + ", " + d);
    }
}
