package j04018;
public class ComplexNumber {
    private int real, image;
    public ComplexNumber() {

    }
    public ComplexNumber(int real, int image) {
        this.real = real;
        this.image = image;
    }
    public ComplexNumber addComplexNumber(ComplexNumber other) {
        ComplexNumber res = new ComplexNumber();
        res.real = this.real + other.real;
        res.image = this.image + other.image;
        return res;
    }
    public ComplexNumber multiplyComplexNumber(ComplexNumber other) {
        ComplexNumber res = new ComplexNumber();
        res.real = this.real * other.real - this.image * other.image ;
        res.image = this.image * other.real + this.real * other.image;
        return res;
    }
    @Override
    public String toString() {
        return real + (image > 0 ? (" + " + image) : (" - " + (-1) * image))  + "i";
    }
}
