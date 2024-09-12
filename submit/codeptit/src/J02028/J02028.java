package J02028;
import java.util.*;
public class J02028 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long k = input.nextLong();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextLong();
            }
            boolean found = false;
            long currSum = 0;
            Set<Long> se = new HashSet<>();
            for (int i = 0; i < n; i++) {
                currSum += a[i];
                if (currSum == k) {
                    found = true;
                    break;
                }
                if (se.contains(currSum - k)) {
                    found = true;
                    break;
                }
                se.add(currSum);
            }
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        input.close();
    }
}
