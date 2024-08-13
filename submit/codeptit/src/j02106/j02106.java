package j02106;
import java.util.*;
public class j02106 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][]a = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = input.nextInt();
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++ ){
            int cnt0 = 0, cnt1 = 0;
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == 1) {
                    cnt1++;
                } else {
                    cnt0++;
                }
            }
            if (cnt1 > cnt0) {
                res++;
            }
            
        }
        System.out.println(res);
        input.close();
    }
}
