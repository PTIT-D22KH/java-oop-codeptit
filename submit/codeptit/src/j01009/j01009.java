package j01009;

import java.util.Scanner;

public class j01009 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = 1;
            for (int j = 1; j <= i; j++) {
                tmp *= j;
            }
            sum += tmp;
        }
        System.out.println(sum);

    }
}
