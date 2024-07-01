package j01003;

public class LinearEquation {
    private int a;
    private int b;
    //ax + b = 0
    public LinearEquation(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void solveEquation() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }          
            return;
        } 
        double res = -1.0 * b / (1.0 * a);
        System.out.printf("%.2f", res);
    }
}
