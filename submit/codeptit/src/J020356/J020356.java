package J020356;
import java.util.*;
public class J020356 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s = input.nextInt();
        if ((s < 1 && n > 1) || (s > 9 * n)) {
            System.out.println("-1 -1");
            return;
        } else if (s == 0 && n == 1) {
            System.out.println("0 0");
            return;
        }
        int sum = s;
        StringBuilder smallest = new StringBuilder();
        StringBuilder largest = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (sum > 9) {
                largest.append("9");
                sum -= 9;
            } else {
                largest.append(String.valueOf(sum));
                sum = 0;
            }
        }
        sum = s;
        for (int i = 0; i < n; i++) {
            for (int d = (i == 0 ? 1 : 0); d <= 9; d++) {
                if (sum - d <= 9 * (n - i - 1)) {
                    smallest.append(d);
                    sum -= d;
                    break;
                }
            }
        }

        System.out.println(smallest.toString() + " " + largest.toString());


        input.close();
    }
}
