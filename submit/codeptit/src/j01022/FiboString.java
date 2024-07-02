package j01022;

public class FiboString {
    private static final long[] fibo = new long[94];
    static {
        fibo[1] = 1;
        fibo[2] = 1;
        for (int i = 3; i < 94; i++ ) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
    public int getKthString(int n, long k) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            if (k > fibo[n - 2]) {
                return getKthString(n - 1, k - fibo[n - 2]);
            } else {
                return getKthString(n - 2, k);
            }
        }
    }
}
