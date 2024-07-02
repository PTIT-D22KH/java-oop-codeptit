package j01007;

public class FibonacciNumber {
    private int n;//stt
    private static final long[]fibo = new long[92];
    static {
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < 92; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
    
    public FibonacciNumber() {

    }
    public FibonacciNumber(int n) {
        this.n = n;
    }
    public long getNthFiboNumber(int n) {
        return fibo[n];
    }
    public boolean isFiboNumber(long x) {
        for (int i = 0; i < 92; i++) {
            if (fibo[i] == x) {
                return true;
            }
        } 
        return false;
    }
}
