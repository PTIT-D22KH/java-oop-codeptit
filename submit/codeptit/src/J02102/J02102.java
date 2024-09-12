package J02102;
import java.util.*;
public class J02102 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a[][] = new int[n][n];
        int count = 0;
        int b[] = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
                b[count++] = a[i][j];
            }
        }
        Arrays.sort(b);
        count = 0;
        int rb = 0, re = n - 1, cb = 0, ce = n - 1;
        while (rb < re && cb < ce) {
            for (int i = cb; i < ce; i++ ){
                a[rb][i] = b[count++];
            }
            for (int i = rb; i < re; i++) {
                a[i][ce] = b[count++];
            } 
            for (int i = ce; i > cb; i--) {
                a[re][i] = b[count++];
            }
            for (int i = re; i > rb; i--) {
                a[i][cb] = b[count++];
            }
            rb++;
            cb++;
            re--;
            ce--;
        }
        if (rb == re && cb == ce) {
            a[rb][re] = b[count++];
        } else if (rb == re && cb < ce) {
            for (int i = cb; i <= ce; i++) {
                a[rb][i] = b[count++];
            }
        } else {
            for (int i = rb; i <= re; i++) {
                a[i][cb] = b[count++];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }

        
        input.close();

    }
}
