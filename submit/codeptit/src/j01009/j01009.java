package j01009;

import java.util.Scanner;

public class j01009 {
    // public static 
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        long a[] = new long[21];
        a[1] = 1;
        a[0] = 0;
        for (int i = 2; i <= 20; i++) {
            a[i] = a[i - 1] * i;
        }
        int n = input.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
        input.close();
    }   
}
