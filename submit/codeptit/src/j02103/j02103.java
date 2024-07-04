package j02103;
import java.util.*;
public class j02103 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        int dem = 1;
        while (t-- > 0) {
            System.out.printf("Test %d:\n", dem);
            dem++;
            testCase();
        }
    }
    public static void testCase(){
        int n  = input.nextInt();
        int m = input.nextInt();
        int [][]a = new int[n][m];
        int [][]b = new int[m][n];
        int [][]res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = a[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", res[i][j]);

            }
            System.out.println();
        }
    }
}
