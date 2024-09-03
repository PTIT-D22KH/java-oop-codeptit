package J04014;

import java.util.Scanner;

public class J04014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            Fraction a = new Fraction(input.nextInt(), input.nextInt());
            Fraction b = new Fraction(input.nextInt(), input.nextInt());
            Fraction c = a.addFraction(b).multiplyFraction(a.addFraction(b));
            Fraction d = a.multiplyFraction(b).multiplyFraction(c);
            System.out.print(c);
            System.out.println(" " + d);
        }
        input.close();
    }
}