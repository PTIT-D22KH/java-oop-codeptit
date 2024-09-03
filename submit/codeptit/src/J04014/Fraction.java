package J04014;

public class Fraction {
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        this.simplify();
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public Fraction addFraction(Fraction other) {
        int lcm = this.denominator * other.denominator / gcd(this.denominator, other.denominator);
        int numeratorSum = this.numerator * (lcm / this.denominator) + other.numerator * (lcm / other.denominator);
        return new Fraction(numeratorSum, lcm);
    }

    public Fraction multiplyFraction(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}