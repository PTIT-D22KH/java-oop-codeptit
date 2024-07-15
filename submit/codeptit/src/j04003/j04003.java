package j04003;

import java.util.Scanner;

public class j04003 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        Fraction x = new Fraction(a, b);
        System.out.println(x);
        input.close();
    }
}
