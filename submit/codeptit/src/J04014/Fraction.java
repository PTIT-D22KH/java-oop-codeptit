package J04014;

public class Fraction {
    private long numerator, denominator;

    public Fraction(long numerator, long denominator) {
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

    private long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private void simplify() {
        long gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public Fraction addFraction(Fraction other) {
        long lcm = this.denominator * (other.denominator / gcd(this.denominator, other.denominator));
        long numeratorSum = this.numerator * (lcm / this.denominator) + other.numerator * (lcm / other.denominator);
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