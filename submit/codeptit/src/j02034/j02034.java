package j02034;
import java.util.*;
public class j02034 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = 0;
        int []fre = new int[203];
        for (int i = 0; i < 203; i++) {
            fre[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            max = input.nextInt();
            fre[max]++;
        }
        boolean ok = true;
        for (int i = 1; i <= max; i++) {
            if (fre[i] == 0) {
                System.out.println(i);
                ok = false;
            }
        }
        if (ok) {
            System.out.println("Excellent!");
        }

        input.close();
    }
}
