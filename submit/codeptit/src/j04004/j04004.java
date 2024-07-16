package j04004;
import java.util.Scanner;
public class j04004 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        long x1, y1, x2, y2;
        x1 = input.nextLong();
        y1 = input.nextLong();
        x2 = input.nextLong();
        y2 = input.nextLong();
        Fraction a = new Fraction(x1, y1);
        Fraction b = new Fraction(x2, y2);
        System.out.println(a.add(b));

        input.close();
    }
}
