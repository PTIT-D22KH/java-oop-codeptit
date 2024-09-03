package J04014;

public class Fraction {
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        
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
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public Fraction addFraction(Fraction other) {
        int ms = lcm(this.denominator, other.denominator);
        int x = ms / this.denominator * this.numerator + ms/other.denominator * other.numerator;
        return new Fraction(x, ms);
    }
 
    public Fraction multiplyFraction(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    @Override
    public String toString() {
        if (denominator < 0) {
            return (numerator * -1) + "/" + (denominator * -1);
        } 
        return numerator + "/" + denominator;
    }
}
