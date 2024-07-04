package j02105;
import java.util.*;
public class j02105 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][]a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("List(%d) = ", i + 1);
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    System.out.printf("%d ", j + 1);
                }
            }
            System.out.println();
        }
        input.close();
    }
}
