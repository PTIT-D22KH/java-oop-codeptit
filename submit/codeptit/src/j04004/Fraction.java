package j04004;

public class Fraction {
    private long numerator; //tu so
    private long denominator; //mau so
    public Fraction(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
    private static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public Fraction add(Fraction other) {
        long gcd_deno = gcd(this.denominator, other.denominator);
        long lcm_deno = this.denominator * other.denominator / gcd_deno;
        long new_numer = lcm_deno / this.denominator * this.numerator + lcm_deno / other.denominator * other.numerator;
        return new Fraction(new_numer, lcm_deno);
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
