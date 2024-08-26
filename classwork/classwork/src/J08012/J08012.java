package J08012;

import java.util.Scanner;

public class J08012 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n + 1];
        for (int i = 1; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            a[x]++;
            a[y]++;
        }
        for (int i = 1; i <= n; i++) {
            if (a[i] != 1 && a[i] != n - 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

        input.close();
    }
}
