package J02035;
import java.util.*;
public class J02035 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long a[] = new long[n];
            long min_val = (long)(1e18);
            int min_index = -1;            
            for (int i = 0; i < n; i++) {
                a[i] = input.nextLong();
                if (a[i] < min_val) {
                    min_val = a[i];
                    min_index = i;
                }
            }
            System.out.println(min_index);
        }
        input.close();
    }
}
