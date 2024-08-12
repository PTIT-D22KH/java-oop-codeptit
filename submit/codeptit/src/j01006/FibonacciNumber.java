package j01006;

public class FibonacciNumber {
    private int n;//stt
    private static int count = 0;
    private static long[] fibo = new long[93];
    private void calFibo() {
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < 93; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

    }

    public FibonacciNumber(int n) {
        count++;
        if (count == 1) {
            calFibo();
        }
        this.n = n;
    }
    public long getNthFiboNumber(int n) {
        return fibo[n];
    }
    
}
