package j04003;

public class Fraction {
    private long numerator; //tu so
    private long denominator; //mau so
    public Fraction(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
    private long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
