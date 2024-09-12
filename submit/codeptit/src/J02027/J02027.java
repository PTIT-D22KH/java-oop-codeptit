package J02027;
import java.util.*;
public class J02027 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            Arrays.sort(a);
            long count = 0;
            int j = 0;
            for (int i = 0; i < n; i++) {
                while (j < n && a[j] - a[i] < k) {
                    j++;
                }
                count += j - i - 1;
            }
            System.out.println(count);
        }
        input.close();
    }
}
