package j01006;

public class FibonacciNumber {
    private int n;//stt
    private static long[]fibo = new long[92];
    public void initFibo() {
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < 92; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
    public FibonacciNumber(int n) {
        this.n = n;
        initFibo();
    }
    public long getNthFiboNumber(int n) {
        return fibo[n];
    }
    
}
