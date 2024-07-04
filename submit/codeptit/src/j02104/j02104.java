package j02104;

import java.util.*;

public class j02104 {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][]a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++ ){
                a[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i][j] == 1) {
                    System.out.printf("(%d,%d)\n", i + 1, j + 1);
                }
            }
        }
        input.close();
    }
    
}
