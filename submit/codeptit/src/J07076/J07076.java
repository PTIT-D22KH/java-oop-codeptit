package J07076;
import java.util.*;
import java.io.*;
public class J07076 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("J07076/MATRIX.in"));
        Scanner input = new Scanner(new File("MATRIX.in"));
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = input.nextInt();
                }
            }
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = a[i][k - 1];
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (b[j] < b[i]) {
                        int temp = b[i];
                        b[i] = b[j];
                        b[j] = temp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                a[i][k - 1] = b[i];
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("%d ", a[i][j]);
                }
                System.out.println();
            }

        }

        input.close();
    }
}
