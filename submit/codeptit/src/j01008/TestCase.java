package j01008;


public class TestCase {
    private static int cnt = 0;

    public TestCase() {
        cnt++;
    }
    public void testCase(int n){
        System.out.printf("Test %d: ", cnt);
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int dem = 0;
                while (n % i == 0) {
                    n /= i;
                    dem++;
                }
                System.out.printf("%d(%d) ", i, dem);
            }
        }
        if (n > 1) {
            System.out.printf("%d(1)", n);
        }
    }
}
